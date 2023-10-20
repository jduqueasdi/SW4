package com.johnduque.geometria.dominio;

public class Cuadrado extends FiguraGeometrica{

    private int base;
    private int altura;

    public Cuadrado(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2*base) + (2*altura);
    }
}
