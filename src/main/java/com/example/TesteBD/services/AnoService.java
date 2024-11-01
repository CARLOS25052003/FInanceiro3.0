package com.example.TesteBD.services;

import com.example.TesteBD.models.Ano;
import com.example.TesteBD.models.Mes;
import com.example.TesteBD.repositorys.AnoRepository;
import com.example.TesteBD.repositorys.MesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnoService {
    @Autowired
    private AnoRepository anoRepository;

    @Autowired
    private MesRepository mesRepository;

    public List<Ano> getAllAnos() {
        return anoRepository.findAll();
    }

    public Ano criarAno(int ano){
        Ano novoAno = new Ano();
        novoAno.setAno(ano);
        return anoRepository.save(novoAno);
    }

    public List<Mes> listarMesesPorAno(Long anoId){
        return mesRepository.findByAnoId(anoId);
    }

    public Mes criarMes(Long anoId, Integer mes) {
        Ano ano = anoRepository.findById(anoId).orElseThrow(() -> new RuntimeException("Ano não encontrado"));
        Mes novoMes = new Mes();
        novoMes.setMes(mes); // Corrigido para usar o campo nomeMes
        novoMes.setAno(ano);
        return mesRepository.save(novoMes); // Corrigido aqui para adicionar o ponto e vírgula
    }

}
