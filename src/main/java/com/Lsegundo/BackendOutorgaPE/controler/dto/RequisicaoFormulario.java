package com.Lsegundo.BackendOutorgaPE.controler.dto;

public record RequisicaoFormulario (
        String modalidade,
        String nomeImovel,
        String cep,
        String logradouro,
        String cidade,
        String latitude,
        String longitude,
        String finalidade
) {
}
