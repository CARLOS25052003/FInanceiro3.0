package com.example.TesteBD.controllers;

import com.example.TesteBD.models.RendaFixa;
import com.example.TesteBD.services.RendaFixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/renda_fixa")
public class RendaFixaController {
    @Autowired
    private RendaFixaService rendaFixaService;

    @PostMapping
    public ResponseEntity<RendaFixa> addRendaFixa(@RequestBody RendaFixa rendaFixa) {
        RendaFixa savedRendaFixa = rendaFixaService.saveRendaFixa(rendaFixa);
        return ResponseEntity.ok(savedRendaFixa);
    }

    @GetMapping
    public List<RendaFixa> getAllRendasFixas() {
        return rendaFixaService.getAllRendasFixas();

    }

    @GetMapping("/totalBalances")
    public double getRendaFixa() {
        return rendaFixaService.getTotalRendasFixas();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteRendaFixa(@PathVariable Long id) {
        rendaFixaService.deleteRendaFixa(id);
        return ResponseEntity.noContent().build();
    }
}
