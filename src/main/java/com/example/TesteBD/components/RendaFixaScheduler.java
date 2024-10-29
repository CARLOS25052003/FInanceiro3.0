package com.example.TesteBD.components;

import com.example.TesteBD.models.RendaFixa;
import com.example.TesteBD.repositorys.RendaFixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class RendaFixaScheduler {
    @Autowired
    private RendaFixaRepository rendaFixaRepository;

    @Scheduled(cron = "0 0 0 1 * ?")
    public void addRendaFixaAutomaticamente(){
        LocalDate currentDate = LocalDate.now();

        List<RendaFixa> rendasFixas = rendaFixaRepository.findAll();

        for (RendaFixa rendaFixa : rendasFixas) {
            System.out.printf("Renda Fixa Adicionada: %s - RS %.2f%n",  rendaFixa.getDescription(),rendaFixa.getAmount());
        }
    }
}
