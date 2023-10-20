package com.johnduque.geometria.dominio;

public class Circulo extends FiguraGeometrica {

    private int radio;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * 2 * radio;
    }
}
