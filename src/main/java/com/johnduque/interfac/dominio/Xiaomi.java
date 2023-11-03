package com.johnduque.interfac.dominio;

public class Xiaomi extends CelularBasico implements Desbloqueable {

    public Xiaomi(String marca, Persona propietario) {
        super(marca, propietario);
    }

    @Override
    public boolean desbloquear(Persona p) {

        if (p.getRostro().equals(this.getPropietario().getRostro())){
            return true;
        }else{
            return super.desbloquear(p);
        }
    }
}
