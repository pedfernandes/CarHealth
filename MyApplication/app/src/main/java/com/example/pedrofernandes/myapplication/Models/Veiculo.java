package com.example.pedrofernandes.myapplication.Models;

public class Veiculo {

    private String placa;
    private String modelo;
    private String marca;
    private double litroTanque;
    private double km;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getLitroTanque() {
        return litroTanque;
    }

    public void setLitroTanque(double litroTanque) {
        this.litroTanque = litroTanque;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
