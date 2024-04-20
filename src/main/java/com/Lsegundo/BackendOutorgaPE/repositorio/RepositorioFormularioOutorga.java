package com.Lsegundo.BackendOutorgaPE.repositorio;

import com.Lsegundo.BackendOutorgaPE.entidades.FormularioOutorga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioFormularioOutorga extends JpaRepository<FormularioOutorga, Long> {

}
