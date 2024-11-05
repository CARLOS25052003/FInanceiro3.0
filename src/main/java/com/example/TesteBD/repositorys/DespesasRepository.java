package com.example.TesteBD.repositorys;

import com.example.TesteBD.models.Despesas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DespesasRepository extends JpaRepository<Despesas, Long> {
    List<Despesas> findByMesId(Long mesId);
}
