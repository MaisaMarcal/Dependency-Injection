package com.tecdes.dependencyinjection.comDi.service;

import org.springframework.stereotype.Service;

import com.tecdes.dependencyinjection.comDi.dto.PagamentoDTO;

@Service
public class CartaoService implements PagamentoService {

    @Override
    public PagamentoDTO processarPagamento(PagamentoDTO pagamentoDTO) {
        System.out.println("Pagamento via Cartão aprovado");
        return pagamentoDTO;
    }
}