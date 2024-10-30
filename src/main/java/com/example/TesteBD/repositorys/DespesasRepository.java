package com.example.TesteBD.repositorys;

import com.example.TesteBD.models.Despesas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesasRepository extends JpaRepository<Despesas, Long> {
}
