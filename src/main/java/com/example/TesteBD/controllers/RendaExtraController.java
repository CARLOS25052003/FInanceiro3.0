package com.example.TesteBD.controllers;

import com.example.TesteBD.models.RendaExtra;
import com.example.TesteBD.services.DespesasService;
import com.example.TesteBD.services.RendaExtraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/renda-extra")
@CrossOrigin(origins = "http://localhost:63342")
public class RendaExtraController {
    @Autowired
    private RendaExtraService rendaExtraService;
    @Autowired
    private DespesasService despesasService;

    @PostMapping
    public ResponseEntity<RendaExtra> createRendaExtra(@RequestBody RendaExtra rendaExtra) {
        RendaExtra savedRendaExtra = rendaExtraService.saveRendaExtra(rendaExtra);
        return ResponseEntity.ok(savedRendaExtra);
    }

    @GetMapping
    public List<RendaExtra> getRendaExtra() {
        return rendaExtraService.getAllRendaExtra();
    }

    @GetMapping("/totalBalance")
    public double getTotalBalance() {
        return rendaExtraService.getTotalBalance();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRendaExtra(@PathVariable Long id) {
        rendaExtraService.deleteRendaExtra(id);
        return ResponseEntity.noContent().build();
    }

}
