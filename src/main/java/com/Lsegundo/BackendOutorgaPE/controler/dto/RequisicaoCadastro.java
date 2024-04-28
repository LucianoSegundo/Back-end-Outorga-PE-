package com.Lsegundo.BackendOutorgaPE.controler.dto;

public record RequisicaoCadastro(String nome,String cpfCnpj, String senha,
                                 String cep, String logradouro, String numeroCasa, String complemento,
                                 String bairro, String cidade, String estado,
                                 String email, String telefone, String celular
                                 ) {
}
