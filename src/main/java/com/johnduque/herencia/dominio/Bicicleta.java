package com.johnduque.herencia.dominio;

public class Bicicleta extends Vehiculo{

    private byte nroPinones;
    private double tamanoRueda;
    private String tipoFreno;

    public Bicicleta(String marca, String linea, short anioModelo, String tipoFreno) {
        super(marca, linea, anioModelo);
        this.tipoFreno = tipoFreno;
    }

    public byte getNroPinones() {
        return nroPinones;
    }

    public double getTamanoRueda() {
        return tamanoRueda;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setNroPinones(byte nroPinones) {
        this.nroPinones = nroPinones;
    }

    public void setTamanoRueda(double tamanoRueda) {
        this.tamanoRueda = tamanoRueda;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    @Override
    public void acelerar() {

    }
}
