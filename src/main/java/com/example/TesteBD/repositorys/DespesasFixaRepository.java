package com.example.TesteBD.repositorys;

import com.example.TesteBD.models.DespesaFixa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DespesasFixaRepository extends JpaRepository<DespesaFixa, Long> {
}
