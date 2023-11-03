package com.johnduque.interfac.dominio;

public class CelularBasico extends Celular implements Desbloqueable {
    public CelularBasico(String marca, Persona propietario) {
        super(marca, propietario);
    }

    @Override
    public boolean desbloquear(Persona p) {
        return p.getCodigo() == this.getPropietario().getCodigo();
    }
}
