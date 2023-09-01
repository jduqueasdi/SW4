package com.johnduque.dispensador.aplicacion;

import com.johnduque.dispensador.dominio.DispesadorDeAgua;

public class AppDispensador {

    public static void main(String[] args) {

        DispesadorDeAgua dispesadorDeAgua = new DispesadorDeAgua(123,"samsung",30,10,16);
        DispesadorDeAgua dispesadorDeAgua1 = new DispesadorDeAgua(1234);

        dispesadorDeAgua.mostrarNivel();
        dispesadorDeAgua.servir(false,12);
    }
}
