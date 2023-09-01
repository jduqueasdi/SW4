package com.johnduque.dispensador.dominio;

public class DispesadorDeAgua {

    public long serial;
    public String marca;
    public double cantidadMaxima;
    public double cantidadActual;
    public double temperatura;
    public DispesadorDeAgua(long serial) {
        this.serial = serial;
    }
    public DispesadorDeAgua(long serial, String marca, double cantidadMaxima, double cantidadActual, double temperatura) {
        this.serial = serial;
        this.marca = marca;
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
        this.temperatura = temperatura;
    }

    public boolean servir(boolean caliente, double cantidadAServir){
        if((cantidadActual-cantidadAServir) >= 0){
            cantidadActual -= cantidadAServir;

            if (caliente){
                System.out.println("Sirvio agua caliente a: "+temperatura+ "°C");
            }else {
                System.out.println("se sirvió agua al clima");
            }
            return true;
        }else {
            System.out.println("No hay cantidad Suficiente");
            return false;
        }

    }

    public void llenar(){
        cantidadActual = cantidadMaxima;
    }

    public void vaciar(){
        this.cantidadActual = 0;
    }

    public boolean calentar(double grados){
        if((temperatura + grados) >= 100){
            return false;
        }else {
            temperatura += grados;
            return true;
        }
    }

    public void enfriar(double grados){
        temperatura -= grados;
    }

    public void mostrarNivel(){
        System.out.println("El dispensador tiene: "+this.cantidadActual+" litros");
    }
}
