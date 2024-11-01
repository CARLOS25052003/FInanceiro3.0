package com.example.TesteBD.controllers;

import com.example.TesteBD.models.Mes;
import com.example.TesteBD.repositorys.AnoRepository;
import com.example.TesteBD.repositorys.MesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.transaction.annotation.Transactional;

@RestController
public class MesController {

    @Autowired
    private MesRepository mesRepository;

    @Autowired
    private AnoRepository anoRepository;

    @PostMapping("/api/atualizarMes")
    @Transactional
    public ResponseEntity<?> atualizarMes() {
        // Obter o mês atual e ano atual
        // (Supondo que você tenha um método para obter o mês e ano atuais)
        Mes mesAtual = mesRepository.findMesAtual(); // Implemente esse método no repositório

        if (mesAtual == null) {
            return ResponseEntity.badRequest().body("Mês atual não encontrado.");
        }

        // Obter o próximo mês
        int mesProximo = mesAtual.getMes() + 1;
        int ano = mesAtual.getAnoId().getAno();

        // Se for dezembro, incrementar o ano
        if (mesProximo > 12) {
            mesProximo = 1;
            ano++;
        }

        // Atualizar o mês atual
        mesAtual.setAnoId(anoRepository.findByAno(ano)); // Supondo que você tenha um método para buscar o ano
        mesAtual.setMes(mesProximo);
        mesRepository.save(mesAtual);

        // Salvar o mês anterior para visualização, se necessário
        // Você pode ter uma tabela separada para histórico ou apenas marcar o mês atual como "concluído"
        // Exemplo de marcar como concluído:
        mesAtual.setConcluido(true);
        mesRepository.save(mesAtual);

        return ResponseEntity.ok("Mês atualizado com sucesso.");
    }
}
