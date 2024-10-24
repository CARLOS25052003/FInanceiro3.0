package com.example.TesteBD.repositorys;

import com.example.TesteBD.models.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository<Salary, Long> {
}
