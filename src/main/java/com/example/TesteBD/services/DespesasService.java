package com.example.TesteBD.services;

import com.example.TesteBD.models.Despesas;
import com.example.TesteBD.repositorys.DespesasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class DespesasService {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Autowired
    private DespesasRepository despesasRepository;

    public Despesas saveDespesas(Despesas despesas) {
        return despesasRepository.save(despesas);
    }

    public List<Despesas> getAllDespesas() {
        return despesasRepository.findAll();
    }
    public Double getTotalDespesas() {
        return despesasRepository.findAll().stream().mapToDouble(Despesas::getAmount).sum();
    }
    public void deleteDespesas(Long id){
        despesasRepository.deleteById(id);
    }
}
