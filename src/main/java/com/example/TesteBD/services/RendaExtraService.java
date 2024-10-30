package com.example.TesteBD.services;

import com.example.TesteBD.models.RendaExtra;
import com.example.TesteBD.repositorys.RendaExtraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RendaExtraService {
    @Autowired
    private RendaExtraRepository rendaExtraRepository;

    public RendaExtra saveRendaExtra(RendaExtra rendaExtra) {
        return rendaExtraRepository.save(rendaExtra);
    }

    public List<RendaExtra> getAllRendaExtra() {
        return rendaExtraRepository.findAll();
    }

    public Double getTotalBalance() {
        return rendaExtraRepository.findAll().stream().mapToDouble(RendaExtra::getAmount).sum();
    }
    public void deleteRendaExtra(Long id) {
        rendaExtraRepository.deleteById(id);
    }
}
