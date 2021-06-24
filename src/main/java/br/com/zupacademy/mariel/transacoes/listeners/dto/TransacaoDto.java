package br.com.zupacademy.mariel.transacoes.listeners.dto;

import br.com.zupacademy.mariel.transacoes.domain.entities.Transacao;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoDto {

    @JsonProperty
    private final BigDecimal valor;
    @JsonProperty
    private final String id;
    @JsonProperty
    private final LocalDateTime efetivadaEm;

    @JsonProperty
    private final EstabelecimentoDto estabelecimento;
    @JsonProperty
    private final CartaoDto cartao;

    @JsonCreator
    public TransacaoDto(@JsonProperty("id") String id, @JsonProperty("valor") BigDecimal valor,
                        @JsonProperty("efetivadaEm") LocalDateTime efetivadaEm, @JsonProperty("cartao") CartaoDto cartao,
                        @JsonProperty("estabelecimento") EstabelecimentoDto estabelecimento) {

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

    public EstabelecimentoDto getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoDto getCartao() {
        return cartao;
    }

    public Transacao toEntity() {
        return new Transacao(efetivadaEm, valor, estabelecimento.getNome(), estabelecimento.getCidade(), estabelecimento.getEndereco(),
                cartao.getId(), cartao.getEmail());
    }
}
