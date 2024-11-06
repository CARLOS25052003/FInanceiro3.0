package com.example.TesteBD.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@Entity
@Table(name="renda_extra")
public class RendaExtra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private double amount;

    @Column(name = "date_added")
    private String dateAdded;

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "mes_id")
    private Mes mes;
=======

>>>>>>> fcf6b5f (Finalizado)
}
