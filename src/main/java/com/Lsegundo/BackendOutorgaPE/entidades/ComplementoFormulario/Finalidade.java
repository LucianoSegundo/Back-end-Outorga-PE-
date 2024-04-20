package com.Lsegundo.BackendOutorgaPE.entidades.ComplementoFormulario;

import jakarta.persistence.*;

@Entity
public class Finalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Coluna_ID")
    private Long id;

    @Column(name = "Coluna_Nome")

    private String nome;

    public  enum valores{
        IRRIGACAO("Irrigação"),
        CONSUMO_ANIMAL("Consumo Animal"),
        CONSUMO_HUMANO("Consumo Humano"),
        ABASTECIMENTO_PUBLICO("Abastecimento Público"),
        AQUICULTURA("Aquicultura"),
        INDUSTRIA("Indústria"),
        EXTRACAO_MINERAL("Extração Mineral"),
        DESASSOREAMENTO("Desassoreamento");

        String finalidade;

        valores(String finalidade) {
            this.finalidade = finalidade;
        }

        public String getFinalidade() {
            return finalidade;
        }

        public void setFinalidade(String finalidade) {
            this.finalidade = finalidade;
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
