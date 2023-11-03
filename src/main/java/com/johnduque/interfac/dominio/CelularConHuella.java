package com.johnduque.interfac.dominio;

public class CelularConHuella extends CelularBasico implements Desbloqueable{

    public CelularConHuella(String marca, Persona propietario) {
        super(marca, propietario);
    }

    @Override
    public boolean desbloquear(Persona p) {
        if(p.getHuella().equals(this.getPropietario().getHuella())){
            return true;
        }
        return super.desbloquear(p);
    }
}
