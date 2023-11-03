package com.johnduque.interfac.dominio;

public abstract class Celular implements Activable {
    private String imei;
    private String marca;
    private String modelo;
    private String color;
    private boolean estaEncendido;
    private Persona propietario;

    public Celular(String marca, Persona propietario) {
        this.marca = marca;
        this.propietario = propietario;
    }

    @Override
    public void encender() {
        this.estaEncendido = true;
    }

    @Override
    public void apagar() {
        this.estaEncendido = false;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
}
