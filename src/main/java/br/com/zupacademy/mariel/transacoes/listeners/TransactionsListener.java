package br.com.zupacademy.mariel.transacoes.listeners;

import br.com.zupacademy.mariel.transacoes.domain.Transacao;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionsListener {

    @KafkaListener(id = "my.transactions", topics = "transacoes")
    void transacao(Transacao transacao) {
        System.out.println("transacao = [" + transacao.getId() + " - " + transacao.getValor());
    }
}
