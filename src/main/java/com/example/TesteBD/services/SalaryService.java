package com.example.TesteBD.services;

import com.example.TesteBD.models.Salary;
import com.example.TesteBD.repositorys.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaryService {
    @Autowired
    private SalaryRepository salaryRepository;

    public Salary saveSalary(Salary salary) {
        return salaryRepository.save(salary);
    }

    public List<Salary> getAllSalaries() {
        return salaryRepository.findAll();
    }

    public Double getTotalBalance() {
        return salaryRepository.findAll().stream().mapToDouble(Salary::getAmount).sum();
    }
    public void deleteSalary(Long id) {
        salaryRepository.deleteById(id);
    }
}
