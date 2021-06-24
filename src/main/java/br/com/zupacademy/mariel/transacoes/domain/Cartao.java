package br.com.zupacademy.mariel.transacoes.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.MessageFormat;

public class Cartao {

    @JsonProperty
    private String id;
    @JsonProperty
    private String email;

    @JsonCreator
    public Cartao(@JsonProperty("id") String id, @JsonProperty("email") String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Transaction [id={0}, email={1}]", id, email);
    }
}
