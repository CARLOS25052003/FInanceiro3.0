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

    public RendaFixa addRendaFixa(RendaFixa rendaFixa) {
        return rendaFixaRepository.save(rendaFixa);
    }

    public List<RendaFixa> getAllRendasFixas() {
        return rendaFixaRepository.findAll();
    }

    public RendaFixa getRendaFixa(Long id) {
        return rendaFixaRepository.findById(id).orElse(null);
    }

    public void deleteRendaFixa(Long id) {
        rendaFixaRepository.deleteById(id);
    }

}
