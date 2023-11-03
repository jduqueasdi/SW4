package com.johnduque.taller.dominio;

import java.util.ArrayList;
import java.util.List;

public class Taller {
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Taller() {
        this.vehiculos = new ArrayList<>();
    }

    public void ingresar(Vehiculo vehiculoAIngrear){
        boolean existe = vehiculos.stream().filter(v->v.getMatricula() ==
                vehiculoAIngrear.getMatricula()).findAny().isPresent();

        if(!existe){
            this.vehiculos.add(vehiculoAIngrear);
        }
    }

    public boolean reparar(Vehiculo vehiculoAReparar){
        if (vehiculoAReparar instanceof Reparable){
            ((Reparable) vehiculoAReparar).reparar();
            return true;
        }
        return false;
    }

    public List<Vehiculo> listar(){
        return this.vehiculos;
    }
}
