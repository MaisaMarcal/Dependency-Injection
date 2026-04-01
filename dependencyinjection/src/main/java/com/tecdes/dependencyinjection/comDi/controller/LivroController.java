package com.tecdes.dependencyinjection.comDi.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tecdes.dependencyinjection.comDi.dto.LivroDTO;
import com.tecdes.dependencyinjection.comDi.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final Map<String, LivroService> services;

    // 🔥 Aqui acontece a INJEÇÃO DE DEPENDÊNCIA
    public LivroController(List<LivroService> listaServices) {
        this.services = listaServices.stream()
                .collect(Collectors.toMap(LivroService::getTipo, s -> s));
    }

    @PostMapping
    public ResponseEntity<LivroDTO> processarLivro(@RequestBody LivroDTO dto) {

        LivroService service = services.get(dto.tipo());

        if (service == null) {
            throw new RuntimeException("Tipo de livro inválido");
        }

        LivroDTO resultado = service.processar(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(resultado);
    }
}