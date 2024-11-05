package com.example.TesteBD.controllers;

import com.example.TesteBD.models.Despesas;
import com.example.TesteBD.models.Mes;
import com.example.TesteBD.models.RendaFixa;
import com.example.TesteBD.models.RendaExtra;
import com.example.TesteBD.models.DespesaFixa;
import com.example.TesteBD.services.MesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mes")
public class MesController {
    @Autowired
    private MesService mesService;

    // Método existente para listar todos os meses
    @GetMapping // Este método agora vai listar todos os meses
    public List<Mes> getAllMeses() {
        return mesService.getAllMes();
    }

    // Novo método para obter rendas e despesas por mês
    @GetMapping("/{id}/renda_fixa")
    public List<RendaFixa> getRendasPorMes(@PathVariable Long id) {
        return mesService.getRendasFixaByMes(id);
    }

    @GetMapping("/{id}/despesas")
    public List<Despesas> getDespesasPorMes(@PathVariable Long id) {
        return mesService.getDespesasByMes(id);
    }

    @GetMapping("/{id}/renda-extra")
    public List<RendaExtra> getRendasExtraPorMes(@PathVariable Long id) {
        return mesService.getRendasExtraByMes(id);
    }

    @GetMapping("/{id}/despesas-fixa")
    public List<DespesaFixa> getDespesasFixaPorMes(@PathVariable Long id) {
        return mesService.getDespesasFixaByMes(id);
    }
}
