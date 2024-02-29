package com.lab3.bertoti.PrimeiraAPiRest.DTO;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CelularDTO(@JsonAlias("id") long id,
                         @JsonAlias("marca") String marcaCelular,
                         @JsonAlias("modelo") String modeloCelular,
                         @JsonAlias("ativo") boolean ativo) {
}
