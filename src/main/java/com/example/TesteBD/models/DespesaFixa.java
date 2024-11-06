package com.example.TesteBD.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Table(name = "despesa_fixa")
public class DespesaFixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Double amount;

    private String dateAdded;

    private String metodoPagamento;

<<<<<<< HEAD
    @ManyToOne
    @JoinColumn(name = "mes_id")
    private Mes mes;
=======
>>>>>>> fcf6b5f (Finalizado)
}
