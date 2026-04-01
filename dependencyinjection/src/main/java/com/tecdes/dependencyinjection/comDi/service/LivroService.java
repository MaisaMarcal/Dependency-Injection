package com.tecdes.dependencyinjection.comDi.service;

import com.tecdes.dependencyinjection.comDi.dto.LivroDTO;

public interface LivroService {

    String getTipo(); // 🔥 ESSENCIAL

    LivroDTO processar(LivroDTO dto);
}