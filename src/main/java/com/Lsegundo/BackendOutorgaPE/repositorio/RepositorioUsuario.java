package com.Lsegundo.BackendOutorgaPE.repositorio;

import com.Lsegundo.BackendOutorgaPE.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, UUID> {

    Optional<Usuario> findByNome(String nome);
}
