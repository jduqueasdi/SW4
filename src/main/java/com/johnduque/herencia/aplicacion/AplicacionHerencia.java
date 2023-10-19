package com.johnduque.herencia.aplicacion;

import com.johnduque.herencia.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class AplicacionHerencia {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        Taxi taxi = new Taxi();
        Bicicleta bici = new Bicicleta();
        BicicletaMontana mtb = new BicicletaMontana();
        BicicletaRuta rutera = new BicicletaRuta();

        vehiculos.add(taxi);
        vehiculos.add(bici);
        vehiculos.add(mtb);
        vehiculos.add(rutera);

        Vehiculo vehiculo1 = mtb;

        ((BicicletaMontana)vehiculo1).setTipoSuspension("");

        taxi.setEmpresa("Amarillo");

        if (vehiculo1 instanceof Bicicleta){
            System.out.println("Es un vehículo");
        }else {
            System.out.println("No es un vehículo");
        }
    }
}
