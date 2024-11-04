package com.example.TesteBD.services;

import com.example.TesteBD.models.Despesas;
import com.example.TesteBD.models.Mes;
import com.example.TesteBD.models.RendaFixa;
import com.example.TesteBD.repositorys.DespesasRepository;
import com.example.TesteBD.repositorys.MesRepository;
import com.example.TesteBD.repositorys.RendaFixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesService {
    @Autowired
    private MesRepository mesRepository;

    @Autowired
    private RendaFixaRepository rendaRepository; // Adicione isso

    @Autowired
    private DespesasRepository despesaRepository; // Adicione isso

    // Método existente
    public List<Mes> getAllMes() {
        return mesRepository.findAll();
    }

    // Novo método para buscar rendas e despesas de um mês específico
    public List<RendaFixa> getRendasByMes(Long mesId) {
        return rendaRepository.findByMesId(mesId); // Implementar este método no repositório
    }

    public List<Despesas> getDespesasByMes(Long mesId) {
        return despesaRepository.findByMesId(mesId); // Implementar este método no repositório
    }
}
