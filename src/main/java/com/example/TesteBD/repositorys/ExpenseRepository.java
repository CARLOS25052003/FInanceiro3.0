package com.example.TesteBD.repositorys;

import com.example.TesteBD.models.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
