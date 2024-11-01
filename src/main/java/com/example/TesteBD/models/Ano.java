package com.example.TesteBD.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
@Table(name = "ano")
public class Ano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int ano;

    @OneToMany(mappedBy = "ano", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mes> meses;
}
