package com.lab3.bertoti.PrimeiraAPiRest.controller;

import com.lab3.bertoti.PrimeiraAPiRest.model.Celular;
import com.lab3.bertoti.PrimeiraAPiRest.model.DadosAtualizaCelular;
import com.lab3.bertoti.PrimeiraAPiRest.repository.CelularRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/celular")
public class CelularController {

    @Autowired
    CelularRepository celularRepository;


    @GetMapping
    public List<Celular> exibiCelular(){
        return celularRepository.findByAtivoTrue();
    }

    @PostMapping("/incluir")
    public void adicionaCelular(@RequestBody Celular celular){
        celularRepository.save(celular);
    }

    @PutMapping
    @Transactional
    public void atualizaCelular(@RequestBody DadosAtualizaCelular dadosCelular){
        Celular celular = celularRepository.getReferenceById(dadosCelular.id());

        celular.atualizaCelular(dadosCelular);
    }
    @DeleteMapping("{id}")
    public ResponseEntity deletaCelular(@PathVariable long id){
        Celular celular = celularRepository.getReferenceById(id);
        celular.deletaCelular();

        return ResponseEntity.noContent().build();
    }
}
