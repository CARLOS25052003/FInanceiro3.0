package com.example.TesteBD.repositorys;

import com.example.TesteBD.models.RendaFixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendaFixaRepository extends JpaRepository<RendaFixa, Long> {
}
