package com.lab3.bertoti.PrimeiraAPiRest.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosAtualizaCelular(@JsonAlias("id") Long id,
                                   @JsonAlias("marca") String marca,
                                   @JsonAlias("modelo") String modelo,
                                   @JsonAlias("ativo") boolean ativo) {
}
