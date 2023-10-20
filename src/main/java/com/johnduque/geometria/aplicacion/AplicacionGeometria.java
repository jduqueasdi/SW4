package com.johnduque.geometria.aplicacion;

import com.johnduque.geometria.dominio.Circulo;
import com.johnduque.geometria.dominio.Cuadrado;
import com.johnduque.geometria.dominio.FiguraGeometrica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AplicacionGeometria {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        Cuadrado cuadrado = new Cuadrado(20, 40);

        List<FiguraGeometrica> figuraGeometricas = new ArrayList<>(Arrays.asList(circulo,cuadrado));
        calcular(figuraGeometricas);
    }

    public static void calcular(List<FiguraGeometrica> figuraGeometricas){
        figuraGeometricas.forEach(figuraGeometrica -> {
            System.out.println(figuraGeometrica + "- Area " + figuraGeometrica.calcularArea());
            System.out.println(figuraGeometrica + "- Perimetro " + figuraGeometrica.calcularPerimetro());
        });
    }
}
