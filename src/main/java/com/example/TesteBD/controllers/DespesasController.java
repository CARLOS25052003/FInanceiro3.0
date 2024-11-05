package com.example.TesteBD.controllers;

import com.example.TesteBD.models.Despesas;
import com.example.TesteBD.services.DespesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
@CrossOrigin(origins="http://localhost:63342")
public class DespesasController {
    @Autowired
    private DespesasService despesasService;

    @PostMapping
    public ResponseEntity<Despesas> createDespesas(@RequestBody Despesas despesas) {
        Despesas savedDespesas = despesasService.saveDespesas(despesas);
        return ResponseEntity.ok(savedDespesas);
    }

    @GetMapping
    public List<Despesas> findAll() {
        return despesasService.getAllDespesas(); // Certifique-se de que este método está implementado no DespesasService
    }
    @GetMapping("/mes/{mesId}")
    public List<Despesas> getDespesasPorMes(@PathVariable Long mesId) {
        return despesasService.getDespesasPorMes(mesId);
    }
    @GetMapping("/total")
    public Double findTotal() {
        return despesasService.getTotalDespesas();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDespesas(@PathVariable Long id) {
        despesasService.deleteDespesas(id);
        return ResponseEntity.noContent().build();
    }
}
