package com.johnduque.calculadora.dominio;

public class Calculadora {

    private String marca;

    public Calculadora(String marca) {
        this.marca = marca;
    }

    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public static double multiplicar(double num1, double num2, double num3){
        return num1*num2*num3;
    }

    public static int multiplicar(int... numeros){
        int resultado = numeros[0];
        for (int i=1 ; i< numeros.length; i++){
            resultado = resultado * numeros[1];
        }
        return resultado;
    }
}
