package br.com.zupacademy.mariel.transacoes.api;

import br.com.zupacademy.mariel.transacoes.domain.entities.Transacao;
import br.com.zupacademy.mariel.transacoes.domain.repositories.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/cartoes")
public class ConsultaUltimasTransacoesController {

    private final TransacaoRepository transacaoRepository;

    @Autowired
    public ConsultaUltimasTransacoesController(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @GetMapping("/{idCartao}/transacoes")
    public ResponseEntity<?> buscaUltimasTransacoes(@PathVariable String idCartao){
        List<Transacao> dezUltimas = transacaoRepository
                .findFirst10ByIdCartaoOrderByEfetivadaEmDesc(idCartao);
        if(dezUltimas.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(dezUltimas);
    }
}
