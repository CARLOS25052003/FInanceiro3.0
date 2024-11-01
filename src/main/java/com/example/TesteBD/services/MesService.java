package com.example.TesteBD.services;

import com.example.TesteBD.models.Mes;
import com.example.TesteBD.repositorys.MesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesService {
    @Autowired
    private MesRepository mesRepository;

    public Mes saveMes(Mes mes){
        return mesRepository.save(mes);
    }
    public List<Mes> getAllMes(){
        return mesRepository.findAll();
    }
    public void deleteMes(Long id){
        mesRepository.deleteById(id);
    }

}
