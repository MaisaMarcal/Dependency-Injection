package com.tecdes.dependencyinjection.comDi.service;

import org.springframework.stereotype.Service;

import com.tecdes.dependencyinjection.comDi.dto.LivroDTO;

@Service
public class LivroFisicoService implements LivroService {

    @Override
    public String getTipo() {
        return "FISICO";
    }

    @Override
    public LivroDTO processar(LivroDTO dto) {
        System.out.println("Enviando livro físico para o cliente");
        return dto;
    }
}