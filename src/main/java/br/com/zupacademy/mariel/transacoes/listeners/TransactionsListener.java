package br.com.zupacademy.mariel.transacoes.listeners;

import br.com.zupacademy.mariel.transacoes.listeners.dto.TransacaoDto;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionsListener {

    @KafkaListener(id = "my.transactions", topics = "transacoes")
    void transacao(TransacaoDto transacao) {
        System.out.println("transacao = [" + transacao.getId() + " - " + transacao.getValor());
    }
}
