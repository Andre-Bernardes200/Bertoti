package com.lab3.bertoti.PrimeiraAPiRest.repository;

import com.lab3.bertoti.PrimeiraAPiRest.model.Celular;
import org.springframework.data.jpa.repository.JpaRepository;

public interface celularRepository extends JpaRepository<Celular,Long> {
}
