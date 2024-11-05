package com.example.TesteBD.services;

import com.example.TesteBD.models.*;
import com.example.TesteBD.repositorys.*;
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
    private RendaExtraRepository rendaExtraRepository;

    @Autowired
    private DespesasRepository despesaRepository; // Adicione isso

    @Autowired
    private DespesasFixaRepository despesaFixaRepository;
    @Autowired
    private AnoRepository anoRepository;


    // Método existente
    public List<Mes> getAllMes() {
        return mesRepository.findAll();
    }

    // Novo método para buscar rendas e despesas de um mês específico
    public List<RendaFixa> getRendasFixaByMes(Long mesId) {
        return rendaRepository.findByMesId(mesId); // Implementar este método no repositório
    }

    public List<RendaExtra> getRendasExtraByMes(Long mesId) {
        return rendaExtraRepository.findByMesId(mesId);
    }

    public List<Despesas> getDespesasByMes(Long mesId) {
        return despesaRepository.findByMesId(mesId); // Implementar este método no repositório
    }

    public  List<DespesaFixa> getDespesasFixaByMes(Long mesId) {
        return despesaFixaRepository.findByMesId(mesId);
    }

}
