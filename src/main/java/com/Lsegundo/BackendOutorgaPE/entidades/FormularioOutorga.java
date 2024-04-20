package com.Lsegundo.BackendOutorgaPE.entidades;

import com.Lsegundo.BackendOutorgaPE.entidades.ComplementoFormulario.Finalidade;
import com.Lsegundo.BackendOutorgaPE.entidades.ComplementoFormulario.TipoInterferencia;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class FormularioOutorga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Coluna_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "Usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "Modalidade_ID")
    private TipoInterferencia modalidade;

    @Column(name = "Coluna_NomeImovel")
    private String nomeImovel;

    @Column(name = "Coluna_CEP")
    private String cep;

    @Column(name = "Coluna_Logradouro")
    private String logradouro;

    @Column(name = "Coluna_Cidade")
    private String cidade;

    @Column(name = "Coluna_Latitude")
    private String latitude;

    @Column(name = "Coluna_Longitude")
    private String longitude;

    @ManyToOne
    @JoinColumn(name = "Finalidade_ID")
    private Finalidade finalidade;
}
