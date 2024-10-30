package com.example.TesteBD.controllers;

import com.example.TesteBD.models.RendaFixa;
import com.example.TesteBD.services.RendaFixaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/renda_fixa")
public class RendaFixaController {
    @Autowired
    private RendaFixaService rendaFixaService;

    @PostMapping
    public RendaFixa addRendaFixa(@RequestBody RendaFixa rendaFixa) {
        return rendaFixaService.addRendaFixa(rendaFixa);
    }

    @GetMapping
    public List<RendaFixa> getAllRendasFixas() {
        return rendaFixaService.getAllRendasFixas();
    }
    @GetMapping("/{id}")
    public RendaFixa getRendaFixa(@PathVariable Long id) {
        return rendaFixaService.getRendaFixa(id);
    }
    @DeleteMapping("{id}")
    public void deleteRendaFixa(@PathVariable Long id) {
        rendaFixaService.deleteRendaFixa(id);
    }
}
