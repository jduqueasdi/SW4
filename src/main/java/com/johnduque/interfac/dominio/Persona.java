package com.johnduque.interfac.dominio;

public class Persona {
    private String nombre;
    private String rostro;
    private  String huella;
    private String patron;
    private int codigo;

    public Persona(String nombre, String rostro, String huella, String patron, int codigo) {
        this.nombre = nombre;
        this.rostro = rostro;
        this.huella = huella;
        this.patron = patron;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRostro() {
        return rostro;
    }

    public void setRostro(String rostro) {
        this.rostro = rostro;
    }

    public String getHuella() {
        return huella;
    }

    public void setHuella(String huella) {
        this.huella = huella;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
