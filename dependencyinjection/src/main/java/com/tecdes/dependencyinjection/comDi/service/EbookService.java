package com.tecdes.dependencyinjection.comDi.service;

import org.springframework.stereotype.Service;

import com.tecdes.dependencyinjection.comDi.dto.LivroDTO;


@Service
public class EbookService implements LivroService {

    @Override
    public String getTipo() {
        return "EBOOK";
    }

    @Override
    public LivroDTO processar(LivroDTO dto) {
        System.out.println("Acesso ao ebook liberado");
        return dto;
    }
}