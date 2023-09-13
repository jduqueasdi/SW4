package com.johnduque.variableestatica.aplicacion;

import com.johnduque.variableestatica.dominio.Libro;

public class App {
    public static void main(String[] args) {
        Libro cienAnios = Libro.crearLibro( "Cien años");
        Libro metodo = Libro.crearLibro("Método");
        Libro libro = Libro.crearLibro("Libro");
        Libro libroUno = Libro.crearLibro("Libro uno");

        System.out.println(metodo.getIbn());

        System.out.println("Se han creado: " + Libro.getNroLibrosCreados());
    }
}
