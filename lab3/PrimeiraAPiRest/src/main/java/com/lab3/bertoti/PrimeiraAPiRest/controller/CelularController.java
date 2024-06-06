package com.lab3.bertoti.PrimeiraAPiRest.controller;

import com.lab3.bertoti.PrimeiraAPiRest.DTO.CelularDTO;
import com.lab3.bertoti.PrimeiraAPiRest.model.Celular;
import com.lab3.bertoti.PrimeiraAPiRest.repository.CelularRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/celular")
@CrossOrigin("*")
public class CelularController {

    @Autowired
    CelularRepository celularRepository;


    @GetMapping("/list")
    public List<Celular> exibiCelular(){
        return celularRepository.findByAtivoTrue();
    }

    @PostMapping("/incluir")
    public void adicionaCelular(@RequestBody Celular celular){
        celularRepository.save(celular);
    }

    @PutMapping("/atualizar/{id}")
    @Transactional
    public void atualizaCelular(@RequestBody CelularDTO dadosCelular, @PathVariable long id){
        Celular celular = celularRepository.getReferenceById(id);
        celular.setMarca(dadosCelular.marcaCelular());
        celular.setModelo(dadosCelular.modeloCelular());

        celular.atualizaCelular(celular);
    }
    @DeleteMapping("{id}")
    public ResponseEntity deletaCelular(@PathVariable long id){
        Celular celular = celularRepository.getReferenceById(id);
        celular.setAtivo(false);

        celularRepository.save(celular);

        return ResponseEntity.noContent().build();
    }
}
