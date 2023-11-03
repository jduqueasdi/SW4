package com.johnduque.taller.dominio;

public abstract class Vehiculo {
    private int matricula;
    private String marca;
    protected boolean bueno;

    public Vehiculo(int matricula, String marca, boolean bueno) {
        this.matricula = matricula;
        this.marca = marca;
        this.bueno = bueno;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isBueno() {
        return bueno;
    }
}
