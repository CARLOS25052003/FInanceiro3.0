package com.example.TesteBD.controllers;

import com.example.TesteBD.models.Salary;
import com.example.TesteBD.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/salaries")
@CrossOrigin(origins = "http://localhost:63342")
public class SalaryController {
    @Autowired
    private SalaryService salaryService;

    @PostMapping
    public ResponseEntity<Salary> createSalary(@RequestBody Salary salary) {
        Salary savedSalary = salaryService.saveSalary(salary);
        return ResponseEntity.ok(savedSalary);
    }

    @GetMapping
    public List<Salary> getSalaries() {
        return salaryService.getAllSalaries();
    }

    @GetMapping("/totalBalance")
    public double getTotalBalance() {
        return salaryService.getTotalBalance();
    }
}
