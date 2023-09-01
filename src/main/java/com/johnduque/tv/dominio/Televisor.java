package com.johnduque.tv.dominio;

public class Televisor {

    public String serial;
    public String marca;
    public short tamanoPantalla;
    public short canal;
    public byte volumen;
    public boolean encendido;

    public void prender(){this.encendido = true;}

    public void apagar(){this.encendido = false;}

    public short cambiarCanal(short nuevoCanal){
        this.canal = nuevoCanal;
        return nuevoCanal;
    }

    public byte cambiarVolumen(byte nuevoVolumen){
        if(nuevoVolumen > 0 && nuevoVolumen <= 100){
            this.volumen = nuevoVolumen;
            return nuevoVolumen;
        }else {
            return this.volumen;
        }
    }
}
