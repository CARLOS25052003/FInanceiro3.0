package com.example.TesteBD.controllers;

import com.example.TesteBD.models.DespesaFixa;
import com.example.TesteBD.models.Despesas;
import com.example.TesteBD.services.DespesasFixaService;
import com.example.TesteBD.services.DespesasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/despesas-fixas")
public class DespesaFixaController {

    @Autowired
    private DespesasFixaService despesasFixaService;
    @Autowired
    private DespesasService despesasService;

    @PostMapping
    public ResponseEntity<Despesas> criarDespesa(@RequestBody Despesas despesa) {
        despesasService.saveDespesas(despesa);
        return ResponseEntity.status(HttpStatus.CREATED).body(despesa);
    }

    @GetMapping
    public ResponseEntity<List<DespesaFixa>> getAllDespesasFixa() {
        List<DespesaFixa> despesasFixas = despesasFixaService.getAllDespesasFixa();
        return ResponseEntity.ok(despesasFixas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DespesaFixa> getDespesaFixa(@PathVariable Long id) {
        DespesaFixa despesaFixa = despesasFixaService.getDespesaFixa(id);
        if (despesaFixa != null) {
            return ResponseEntity.ok(despesaFixa);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDespesaFixa(@PathVariable Long id) {
        despesasFixaService.deleteDespesaFixa(id);
        return ResponseEntity.noContent().build();
    }
}
