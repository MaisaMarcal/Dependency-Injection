package com.tecdes.dependencyinjection.comDi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecdes.dependencyinjection.comDi.dto.PagamentoDTO;
import com.tecdes.dependencyinjection.comDi.service.BoletoService;
import com.tecdes.dependencyinjection.comDi.service.CartaoService;
import com.tecdes.dependencyinjection.comDi.service.PixService;


@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

    private final PixService pixService;
    private final CartaoService cartaoService;
    private final BoletoService boletoService;

    public PagamentoController(PixService pixService, CartaoService cartaoService, BoletoService boletoService) {
        this.pixService = pixService;
        this.cartaoService = cartaoService;
        this.boletoService = boletoService;
    }

    @PostMapping
    public ResponseEntity<PagamentoDTO> processarPagamento(@RequestBody PagamentoDTO pagamentoDTO) {

        PagamentoDTO resultado;

        switch (pagamentoDTO.tipoPagamento()) {
            case "PIX":
                resultado = pixService.processarPagamento(pagamentoDTO);
                break;

            case "CARTAO":
                resultado = cartaoService.processarPagamento(pagamentoDTO);
                break;

            case "BOLETO":
                resultado = boletoService.processarPagamento(pagamentoDTO);
                break;

            default:
                throw new RuntimeException("Tipo de pagamento inválido");
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(resultado);
    }
}