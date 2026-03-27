package com.tecdes.dependencyinjection.comDi.service;

import org.springframework.stereotype.Service;

import com.tecdes.dependencyinjection.comDi.dto.PagamentoDTO;

@Service
public class BoletoService implements PagamentoService {
    @Override
    public PagamentoDTO processarPagamento(PagamentoDTO pagamentoDTO) {
        System.out.println("Boleto gerado");
        return pagamentoDTO;
    }

        
    }
