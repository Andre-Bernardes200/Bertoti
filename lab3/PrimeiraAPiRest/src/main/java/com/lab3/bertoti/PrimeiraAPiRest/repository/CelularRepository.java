package com.lab3.bertoti.PrimeiraAPiRest.repository;

import com.lab3.bertoti.PrimeiraAPiRest.model.Celular;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CelularRepository extends JpaRepository<Celular,Long> {

    List<Celular> findByAtivoTrue();
}
