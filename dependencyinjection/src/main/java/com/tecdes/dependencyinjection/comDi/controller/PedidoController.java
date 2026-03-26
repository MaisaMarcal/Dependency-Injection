package com.tecdes.dependencyinjection.comDi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tecdes.dependencyinjection.comDi.service.NotificacaoService;


@RestController

public class PedidoController {

    private final NotificacaoService notificacaoService;

    // Injeção de dependência via construtor
    public PedidoController(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;

}
    
// CREATE - criar médico
    @PostMapping("/salvar")
    public ResponseEntity<PedidoDTO> criarPedido(@RequestBody PedidoDTO pedidoDTO) {

        
        NotificacaoService PedidoCriado = notificacaoService.string(pedidoDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(pedidoDTO);
    }


      
}
