package com.example.TesteBD.services;

import com.example.TesteBD.models.Ano;
import com.example.TesteBD.models.Mes;
import com.example.TesteBD.repositorys.AnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnoService {
    @Autowired
    private AnoRepository anoRepository;

    public List<Ano> getAllAnos() {
        return anoRepository.findAll();
    }

    public Ano criarAno(int ano) {
        Ano novoAno = new Ano();
        novoAno.setAno(ano);
        return anoRepository.save(novoAno);
    }

    public List<Mes> listarMesesPorAno(Long anoId) {
        return anoRepository.findById(anoId).map(Ano::getMeses).orElse(null);
    }
}
