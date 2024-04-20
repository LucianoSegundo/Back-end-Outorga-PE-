package com.Lsegundo.BackendOutorgaPE.entidades;

import com.Lsegundo.BackendOutorgaPE.entidades.ComplementoUsuario.Contatos;
import com.Lsegundo.BackendOutorgaPE.entidades.ComplementoUsuario.Endereco;
import com.Lsegundo.BackendOutorgaPE.entidades.ComplementoUsuario.Funcao;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "Tabela_Usuarios")
public class Usuario {

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        @Column(name = "Coluna_ID")
        private UUID id;

        @Column(name = "Coluna_Nome")
        private String nome;

        @Column(name = "Coluna_CPF/CNPJ", unique = true)
        private String cpfCnpj;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn
                (
                        name = "Endereco_ID",
                        referencedColumnName = "Coluna_ID"
                )
        private Endereco endereco;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn
                (
                        name = "Contatos_ID",
                        referencedColumnName = "Coluna_ID"
                )
        private Contatos contatos;
        @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
        private List<FormularioOutorga> formularios;

        @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinTable
        (
                name = "Tabela_Usua_funcao",
                joinColumns = @JoinColumn(name = "Id_Usuario"),
                inverseJoinColumns = @JoinColumn(name = "Id_funcao")
        )
        private Set<Funcao> Funcoes;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contatos getContatos() {
        return contatos;
    }

    public void setContatos(Contatos contatos) {
        this.contatos = contatos;
    }

    public List<FormularioOutorga> getFormularios() {
        return formularios;
    }

    public void setFormularios(List<FormularioOutorga> formularios) {
        this.formularios = formularios;
    }

    public Set<Funcao> getFuncoes() {
        return Funcoes;
    }

    public void setFuncoes(Set<Funcao> funcoes) {
        Funcoes = funcoes;
    }
}
