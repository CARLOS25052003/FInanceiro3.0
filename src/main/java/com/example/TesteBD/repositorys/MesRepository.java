package com.example.TesteBD.repositorys;

import com.example.TesteBD.models.Mes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MesRepository  extends JpaRepository<Mes,Long> {
}
