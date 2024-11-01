package com.example.TesteBD.repositorys;

import com.example.TesteBD.models.RendaExtra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RendaExtraRepository extends JpaRepository<RendaExtra, Long> {
    List<RendaExtra> findByMesId(Long id);
}
