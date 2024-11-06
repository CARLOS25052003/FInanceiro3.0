package com.example.TesteBD.services;
import com.example.TesteBD.models.DespesaFixa;
import com.example.TesteBD.models.Despesas;
import com.example.TesteBD.repositorys.DespesasFixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesasFixaService {
    @Autowired
    private DespesasFixaRepository despesasFixaRepository;

    public DespesaFixa addDespesaFixa(DespesaFixa despesaFixa) {
        return despesasFixaRepository.save(despesaFixa);
    }

    public List<DespesaFixa> getAllDespesasFixa() {
        return despesasFixaRepository.findAll();
    }


    public void deleteDespesaFixa(Long id) {
        despesasFixaRepository.deleteById(id);
    }
}
