package com.johnduque.herencia.dominio;

public abstract class Vehiculo {

    private String matricula;
    private String marca;
    private String linea;
    private short anioModelo;
    private String color;

    public Vehiculo(String marca, String linea, short anioModelo) {
        this.marca = marca;
        this.linea = linea;
        this.anioModelo = anioModelo;
    }

    public abstract void acelerar();

    public void frenar(){
        System.out.println("Frenó");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", linea='" + linea + '\'' +
                '}';
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getLinea() {
        return linea;
    }

    public short getAnioModelo() {
        return anioModelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
