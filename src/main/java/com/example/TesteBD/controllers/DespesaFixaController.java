package com.example.TesteBD.controllers;

import com.example.TesteBD.models.DespesaFixa;
import com.example.TesteBD.services.DespesasFixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesa-fixa")
public class DespesaFixaController {

    @Autowired
    private DespesasFixaService despesaFixaService;

    @PostMapping
    public ResponseEntity<DespesaFixa> createDespesaFixa(@RequestBody DespesaFixa despesaFixa) {
        DespesaFixa savedDespesaFixa = despesaFixaService.addDespesaFixa(despesaFixa);
        return ResponseEntity.ok(savedDespesaFixa);
    }

    @GetMapping("/mes/{mesId}")
    public List<DespesaFixa> getDespesasFixasPorMes(@PathVariable Long mesId) {
        return despesaFixaService.getDespesasFixasPorMes(mesId);
    }
}
