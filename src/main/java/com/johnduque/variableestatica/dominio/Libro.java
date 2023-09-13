package com.johnduque.variableestatica.dominio;

public class Libro {
    private int ibn;
    private String titulo;
    private String autor;
    private static String editorial = "Norma";
    private static int nroLibrosCreados = 0;

    private Libro(String titulo) {
        this.titulo = titulo;
        this.ibn = nroLibrosCreados + 1;

        Libro.nroLibrosCreados++;
    }

    public static Libro crearLibro(String titulo){
        if(nroLibrosCreados < 3){
            return new Libro(titulo);
        }else {
            System.out.println("No puede crear más de tres libro");
            return null;
        }
    }

    public int getIbn() {
        return ibn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public static String getEditorial() {
        return editorial;
    }

    public static int getNroLibrosCreados() {
        return nroLibrosCreados;
    }

    public static void setEditorial(String editorial) {
        Libro.editorial = editorial;
    }
}
