package com.Lsegundo.BackendOutorgaPE.repositorio.ComplementoUsuarioRepositorio;

import com.Lsegundo.BackendOutorgaPE.entidades.ComplementoUsuario.Funcao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioFuncao extends JpaRepository<Funcao, Long> {

}
