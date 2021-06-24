package br.com.zupacademy.mariel.transacoes.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {

    @JsonProperty
    private final BigDecimal valor;
    @JsonProperty
    private final String id;
    @JsonProperty
    private final LocalDateTime efetivadaEm;

    @JsonProperty
    private final Estabelecimento estabelecimento;
    @JsonProperty
    private final Cartao cartao;

    @JsonCreator
    public Transacao(@JsonProperty("id") String id, @JsonProperty("valor") BigDecimal valor,
                     @JsonProperty("efetivadaEm") LocalDateTime efetivadaEm, @JsonProperty("cartao") Cartao cartao,
                     @JsonProperty("estabelecimento") Estabelecimento estabelecimento) {

        this.valor = valor;
        this.id = id;
        this.efetivadaEm = efetivadaEm;
        this.cartao = cartao;
        this.estabelecimento = estabelecimento;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

}
