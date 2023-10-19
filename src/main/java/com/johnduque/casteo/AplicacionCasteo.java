package com.johnduque.casteo;

import com.johnduque.calculadora.dominio.Calculadora;
import com.johnduque.dominio.Persona;

public class AplicacionCasteo {
    public static void main(String[] args) {
        //Upcasting
        Object miObjeto = new Calculadora("Casio");

        //Downcasting
        if(miObjeto instanceof Persona){
            Persona persona = (Persona) miObjeto;
            System.out.println(persona.getNombre());
        }else {
            System.out.println("El objeto no es tipo persona");
        }


        //Casteo implícito
        int numero = 3000;
        long numeroLong = numero;

        //Casteo explícito
        long otroNumero = 50000;
        byte numeroInt = (byte) otroNumero;

        System.out.println(numeroInt);

        //Casteo String a número
        try{
            String texto = "24";
            short numeroTexto = Short.parseShort(texto);
            System.out.println(numeroTexto);

        } catch (Exception e) {
            System.out.println("Ingrese un número");
        }

        //Casteo de número a String
        long numeroG = 12233432;
        String textoG = String.valueOf(numeroG);
        String otroTexto = Long.toString(numeroG);
        System.out.println(textoG);

    }
}
