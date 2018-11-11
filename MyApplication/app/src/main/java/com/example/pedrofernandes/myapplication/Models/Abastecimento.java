package com.example.pedrofernandes.myapplication.Models;

public class Abastecimento {

    private String tipo;
    private double valor;
    private double quantidade;
    private date dataAbastecimento;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public date getDataAbastecimento() {
        return dataAbastecimento;
    }

    public void setDataAbastecimento(date dataAbastecimento) {
        this.dataAbastecimento = dataAbastecimento;
    }
}
