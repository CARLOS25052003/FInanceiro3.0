package com.example.TesteBD.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@Entity
@Table(name="despesas")
public class Despesas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description; // Descrição da despesa
    private double amount;       // Valor da despesa
    @Column(name="date_added")
    private String dateAdded;

    private String metodoPagamento;

    @ManyToOne
    @JoinColumn(name = "mes_id")
    private Mes mes;
}
