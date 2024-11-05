package com.example.TesteBD.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@Entity
@Table(name = "anos")
public class Ano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer ano;

    @OneToMany(mappedBy = "ano", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Mes> meses;
}
