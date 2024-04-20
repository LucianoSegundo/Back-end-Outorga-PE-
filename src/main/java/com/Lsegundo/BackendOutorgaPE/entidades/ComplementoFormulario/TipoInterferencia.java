package com.Lsegundo.BackendOutorgaPE.entidades.ComplementoFormulario;

import jakarta.persistence.*;

@Entity
public class TipoInterferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Coluna_ID")
    private Long id;

    @Column(name = "Coluna_Nome")

    private String nome;

    public  enum valores{

        SUBTERRANEA("Subterrânea"),
        SUPERFICIAL("Superficial");

        String interferencia;

        valores(String interferencia) {
            this.interferencia = interferencia;
        }

        public String getInterferencia() {
            return interferencia;
        }

        public void setInterferencia(String interferencia) {
            this.interferencia = interferencia;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
