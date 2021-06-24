package br.com.zupacademy.mariel.transacoes.listeners;

import br.com.zupacademy.mariel.transacoes.domain.repositories.TransacaoRepository;
import br.com.zupacademy.mariel.transacoes.listeners.dto.TransacaoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionsListener {

    private final TransacaoRepository transacaoRepository;

    @Autowired
    public TransactionsListener(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @KafkaListener(id = "my.transactions", topics = "transacoes")
    void transacao(TransacaoDto dto) {
        transacaoRepository.save(dto.toEntity());
        System.out.println("transacao = [" + dto.getId() + " - " + dto.getValor());
    }
}
