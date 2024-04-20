package com.Lsegundo.BackendOutorgaPE.repositorio.ComplementoFormularioRepositorio;

import com.Lsegundo.BackendOutorgaPE.entidades.ComplementoFormulario.TipoInterferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositorioTipoInterferencia extends JpaRepository<TipoInterferencia, Long> {

}
