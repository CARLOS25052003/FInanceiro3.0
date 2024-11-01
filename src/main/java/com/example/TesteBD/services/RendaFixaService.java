package com.example.TesteBD.services;

import com.example.TesteBD.models.RendaFixa;
import com.example.TesteBD.repositorys.RendaFixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RendaFixaService {
    @Autowired
    private RendaFixaRepository rendaFixaRepository;

    public RendaFixa saveRendaFixa(RendaFixa rendaFixa) {
        return rendaFixaRepository.save(rendaFixa);
    }

    public List<RendaFixa> getAllRendasFixas() {
        return rendaFixaRepository.findAll();
    }

    public List<RendaFixa> getRendasFixasPorMes(Long mesId) {
        return rendaFixaRepository.findByMesId(mesId);
    }
    public Double getTotalRendasFixas() {
        return rendaFixaRepository.findAll().stream().mapToDouble(RendaFixa::getAmount).sum();
    }
    public void deleteRendaFixa(Long id) {
        rendaFixaRepository.deleteById(id);
    }

}
