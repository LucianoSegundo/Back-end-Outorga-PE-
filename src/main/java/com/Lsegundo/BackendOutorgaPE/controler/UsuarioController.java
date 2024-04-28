package com.Lsegundo.BackendOutorgaPE.controler;

import com.Lsegundo.BackendOutorgaPE.controler.dto.RequisicaoCadastro;
import com.Lsegundo.BackendOutorgaPE.entidades.ComplementoUsuario.Funcao;
import com.Lsegundo.BackendOutorgaPE.entidades.Usuario;
import com.Lsegundo.BackendOutorgaPE.repositorio.ComplementoUsuarioRepositorio.RepositorioFuncao;
import com.Lsegundo.BackendOutorgaPE.repositorio.RepositorioUsuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class UsuarioController {

    private RepositorioUsuario usuarioRepo;
    private BCryptPasswordEncoder codificadorSenha;
    private RepositorioFuncao funcaoRepo;

    public UsuarioController(RepositorioUsuario usuarioRepo, BCryptPasswordEncoder codificadorSenha, RepositorioFuncao funcaoRepo) {
        this.usuarioRepo = usuarioRepo;
        this.codificadorSenha = codificadorSenha;
        this.funcaoRepo = funcaoRepo;

    }

    @PostMapping("/cadastro")
    @Transactional
    public ResponseEntity<String> metodoCadastro(@RequestBody RequisicaoCadastro requisicao){

        var funcaopadrao = funcaoRepo.findByNome(Funcao.Valores.USUARIO.name());

        var usuarioBanco = usuarioRepo.findByNome(requisicao.nome());

        if(usuarioBanco.isPresent()) throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY);

        var usuario = new Usuario(requisicao , funcaopadrao.get(), codificadorSenha);

        if(usuario.validacao() == false) return ResponseEntity.badRequest().build();

        usuarioRepo.save(usuario);

        return ResponseEntity.ok("Usuario cadastrado com sucesso");





    }

}
