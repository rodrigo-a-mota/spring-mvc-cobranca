package com.algaworks.spring_mvc_cobranca.repository;

import com.algaworks.spring_mvc_cobranca.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Titulos extends JpaRepository<Titulo, Long> {
}
