package br.com.zupacademy.mariel.transacoes.domain.repositories;

import br.com.zupacademy.mariel.transacoes.domain.entities.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findFirst10ByIdCartaoOrderByEfetivadaEmDesc(String idCartao);
}
