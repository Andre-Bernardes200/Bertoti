package com.lab3.bertoti.PrimeiraAPiRest.model;

import com.lab3.bertoti.PrimeiraAPiRest.DTO.CelularDTO;
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

    public void atualizaCelular(CelularDTO celularNovo){
        this.marca = celularNovo.marcaCelular();
        this.modelo = celularNovo.modeloCelular();
        this.ativo = celularNovo.ativo();
    }

    public void deletaCelular(){
        this.ativo = false;
    }
    
}
