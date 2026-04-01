package com.tecdes.dependencyinjection.comDi.model;

public class Livro {

    private Long id;
    private String titulo;
    private String tipo; // FISICO, EBOOK, AUDIOBOOK
    private String cliente;

    public Livro() {
    }

    public Livro(Long id, String titulo, String tipo, String cliente) {
        this.id = id;
        this.titulo = titulo;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}