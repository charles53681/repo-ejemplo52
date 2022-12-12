package com.bytesw.agregacionCompo;

public class Chip {
    private String operadora;
    private String numero;

    public Chip(String operadora, String numero) {
        this.operadora = operadora;
        this.numero = numero;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return "Chip{" +
                "operadora='" + operadora + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
