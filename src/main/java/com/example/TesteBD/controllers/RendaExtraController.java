package com.example.TesteBD.controllers;

import com.example.TesteBD.models.RendaExtra;
import com.example.TesteBD.services.RendaExtraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/renda-extra")
public class RendaExtraController {

    @Autowired
    private RendaExtraService rendaExtraService;

    @PostMapping
    public ResponseEntity<RendaExtra> createRendaExtra(@RequestBody RendaExtra rendaExtra) {
        RendaExtra savedRendaExtra = rendaExtraService.saveRendaExtra(rendaExtra);
        return ResponseEntity.ok(savedRendaExtra);
    }

    @GetMapping("/mes/{mesId}")
    public List<RendaExtra> getRendasExtrasPorMes(@PathVariable Long mesId) {
        return rendaExtraService.getRendasExtrasPorMes(mesId);
    }
}
