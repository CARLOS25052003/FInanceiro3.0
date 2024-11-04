package com.example.TesteBD.controllers;

import com.example.TesteBD.models.DespesaFixa;
import com.example.TesteBD.services.DespesasFixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/despesas-fixas")
public class DespesaFixaController {
    @Autowired
    private DespesasFixaService despesasFixaService;

    @PostMapping
    public ResponseEntity<DespesaFixa> criarDespesa(@RequestBody DespesaFixa despesaFixa) {
        DespesaFixa savedDespesaFixa = despesasFixaService.addDespesaFixa(despesaFixa);
        return ResponseEntity.ok(savedDespesaFixa);
    }

    @GetMapping
    public List<DespesaFixa> getDespesasFixa() {
    return despesasFixaService.getAllDespesasFixa();
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDespesaFixa(@PathVariable Long id) {
        despesasFixaService.deleteDespesaFixa(id);
        return ResponseEntity.noContent().build();
    }
}
