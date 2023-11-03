package com.johnduque.taller.dominio;

public class Bus extends Vehiculo implements Reparable{
    public Bus(int matricula, String marca, boolean bueno) {
        super(matricula, marca, bueno);
    }

    @Override
    public boolean reparar() {
        return this.bueno=true;
    }
}
