package com.example.TesteBD.controllers;

import com.example.TesteBD.models.Ano;
import com.example.TesteBD.models.Mes;
import com.example.TesteBD.services.AnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anos")
public class AnoController {

    @Autowired
    private AnoService anoService;

    @GetMapping
    public List<Ano> listarAnos() {
        return anoService.getAllAnos();
    }

    @PostMapping
    public ResponseEntity<Ano> criarAno(@RequestBody int ano) {
        Ano novoAno = anoService.criarAno(ano);
        return ResponseEntity.ok(novoAno);
    }

    @GetMapping("/{anoId}/meses")
    public List<Mes> listarMesesPorAno(@PathVariable Long anoId) {
        return anoService.listarMesesPorAno(anoId);
    }

    @PostMapping("/{anoId}/meses")
    public ResponseEntity<Mes> criarMes(@PathVariable Long anoId, @RequestBody Integer mes) {
        Mes novoMes = anoService.criarMes(anoId, mes);
        return ResponseEntity.ok(novoMes);
    }
}
