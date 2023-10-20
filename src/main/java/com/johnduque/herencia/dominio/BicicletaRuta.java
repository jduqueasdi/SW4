package com.johnduque.herencia.dominio;

public final class BicicletaRuta extends Bicicleta{

    public BicicletaRuta(String marca, String linea, short anioModelo, String tipoFreno) {
        super(marca, linea, anioModelo, tipoFreno);
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta de ruta acelerá diferente");
    }
}
