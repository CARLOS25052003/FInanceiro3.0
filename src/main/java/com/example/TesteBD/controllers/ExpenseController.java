package com.example.TesteBD.controllers;

import com.example.TesteBD.models.Expense;
import com.example.TesteBD.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:63342")
@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    @Autowired
    private ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<Expense> createExpense(@RequestBody Expense expense) {
        Expense savedExpense = expenseService.save(expense);
        return ResponseEntity.ok(savedExpense);
    }

    @GetMapping
    public List<Expense> findAll() {
        return expenseService.findAll(); // Certifique-se de que este método está implementado no ExpenseService
    }

    @GetMapping("/total")
    public Double findTotal() {
        return expenseService.getTotalExpenses();
    }
}
