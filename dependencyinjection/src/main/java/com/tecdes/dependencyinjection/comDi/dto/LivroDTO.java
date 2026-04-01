package com.tecdes.dependencyinjection.comDi.dto;

public record LivroDTO (
    Long id,
    String titulo,
    String tipo,   // FISICO, EBOOK, AUDIOBOOK
    String cliente
) {}