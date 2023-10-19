package com.johnduque.herencia.dominio;

public class Taxi extends Vehiculo {

    private String registroCirculacion;
    private String empresa;
    private byte numeroPasajeros;

    public String getRegistroCirculacion() {
        return registroCirculacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public byte getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setRegistroCirculacion(String registroCirculacion) {
        this.registroCirculacion = registroCirculacion;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setNumeroPasajeros(byte numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }
}
