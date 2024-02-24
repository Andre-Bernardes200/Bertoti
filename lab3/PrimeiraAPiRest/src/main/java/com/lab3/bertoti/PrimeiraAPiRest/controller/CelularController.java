package com.lab3.bertoti.PrimeiraAPiRest.controller;

import com.lab3.bertoti.PrimeiraAPiRest.model.Celular;
import com.lab3.bertoti.PrimeiraAPiRest.repository.CelularRepository;
import jakarta.annotation.Resource;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/celular")
public class CelularController {

    @Autowired
    CelularRepository celularRepository;


    @GetMapping
    public List<Celular> exibiCelular(){
        return celularRepository.findAll();
    }
}
