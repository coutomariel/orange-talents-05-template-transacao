package br.com.zupacademy.mariel.transacoes.listeners.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EstabelecimentoDto {

    @JsonProperty
    private String nome;
    @JsonProperty
    private String cidade;
    @JsonProperty
    private String endereco;

    @JsonCreator
    public EstabelecimentoDto(@JsonProperty("nome") String nome, @JsonProperty("cidade") String cidade,
                              @JsonProperty("endereco") String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

}
