package com.tecdes.dependencyinjection.comDi.service;

import org.springframework.stereotype.Service;

import com.tecdes.dependencyinjection.comDi.dto.LivroDTO;

@Service
public class AudiobookService implements LivroService {

    @Override
    public String getTipo() {
        return "AUDIOBOOK";
    }

    @Override
    public LivroDTO processar(LivroDTO dto) {
        System.out.println("Reproduzindo audiobook para o cliente");
        return dto;
    }
}