package br.com.zupacademy.mariel.transacoes.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private LocalDateTime efetivadaEm;
    private BigDecimal valor;

    private String nomeEstabelecimento;
    private String cidadeEstabelecimento;
    private String enderecoEstabelecimento;

    private String idCartao;
    private String email;

    public Transacao(LocalDateTime efetivadaEm, BigDecimal valor, String nomeEstabelecimento, String cidadeEstabelecimento, String enderecoEstabelecimento, String idCartao, String email) {
        this.efetivadaEm = efetivadaEm;
        this.valor = valor;
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.cidadeEstabelecimento = cidadeEstabelecimento;
        this.enderecoEstabelecimento = enderecoEstabelecimento;
        this.idCartao = idCartao;
        this.email = email;
    }
}
