package com.mycompany.nivelamento6;

public class Pokemon {

    private String nome;
    private String tipo;
    private Double forca;
    private Double doces;
    
    public Pokemon(String nome, String tipo, Double forca, Double doces) {
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = doces;
    }

    @Override
    public String toString() {
        return String.format("""
                             Nome: %s 
                             Tipo: %s 
                             Força: %.2f 
                             Doces: %.2f
                             """, getNome(), getTipo(), getForca(), getDoces())
        ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getForca() {
        return forca;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public Double getDoces() {
        return doces;
    }

    public void setDoces(Double doces) {
        this.doces = doces;
    }

}
