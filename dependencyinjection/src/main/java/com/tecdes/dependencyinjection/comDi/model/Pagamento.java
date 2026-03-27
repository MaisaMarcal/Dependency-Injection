package com.tecdes.dependencyinjection.comDi.model;

public class Pagamento {

    private Long id;
    private Double valor;
    private String tipoPagamento;
    private String cliente;

    public Pagamento() {
    }

    public Pagamento(Long id, Double valor, String tipoPagamento, String cliente) {
        this.id = id;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
        this.cliente = cliente;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}