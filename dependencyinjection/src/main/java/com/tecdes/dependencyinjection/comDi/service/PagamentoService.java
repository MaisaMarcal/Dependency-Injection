package com.tecdes.dependencyinjection.comDi.service;

import com.tecdes.dependencyinjection.comDi.dto.PagamentoDTO;

public interface PagamentoService {
    PagamentoDTO processarPagamento(PagamentoDTO pagamentoDTO);
}