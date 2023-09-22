package com.johnduque.calculadora.aplicacion;

import com.johnduque.calculadora.dominio.Calculadora;

public class App {
    public static void main(String[] args) {
        double resultado = Calculadora.multiplicar(2,5);
        System.out.println(resultado);

        double resultado1 = Calculadora.multiplicar(2,5,4);
        System.out.println(resultado1);
    }
}
