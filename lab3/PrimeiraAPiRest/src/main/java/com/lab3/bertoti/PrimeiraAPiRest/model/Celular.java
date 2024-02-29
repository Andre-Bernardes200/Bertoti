package com.lab3.bertoti.PrimeiraAPiRest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.function.BinaryOperator;

@Entity
@Table(name = "celular")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Celular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String marca;

    private String modelo;

    private boolean ativo = true;

    public void atualizaCelular(DadosAtualizaCelular celularNovo){
        this.marca = celularNovo.marca();
        this.modelo = celularNovo.modelo();
        this.ativo = celularNovo.ativo();
    }

    public void deletaCelular(){
        this.ativo = false;
    }
    
}
