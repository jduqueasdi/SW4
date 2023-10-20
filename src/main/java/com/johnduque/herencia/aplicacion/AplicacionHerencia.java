package com.johnduque.herencia.aplicacion;

import com.johnduque.herencia.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class AplicacionHerencia {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        Taxi taxi = new Taxi("Mazda", "CX-30", (short) 2020);
        Bicicleta bici = new Bicicleta("GW", "Ocelot", (short) 2023, "Hidraulico");
        BicicletaMontana mtb = new BicicletaMontana("GW", "Phanter", (short) 2020, "Hidraulico", "Fox");
        BicicletaRuta rutera = new BicicletaRuta("Specialized", "Ruta", (short) 2020, "Hidraulico");

        vehiculos.add(taxi);
        vehiculos.add(bici);
        vehiculos.add(mtb);
        vehiculos.add(rutera);

        Vehiculo vehiculo1 = mtb;

        ((BicicletaMontana)vehiculo1).setTipoSuspension("");

        taxi.setEmpresa("Amarillo");

        mostrarVehiculo(vehiculos);
        acelerarVehiculo(vehiculos);
    }

    private static void acelerarVehiculo(List<Vehiculo> vehiculos){
        vehiculos.forEach(vehiculo -> {
            vehiculo.acelerar();
        });
    }

    private static void mostrarVehiculo(List<Vehiculo> vehiculos){
        vehiculos.forEach(vehiculo -> {
            if(vehiculo instanceof Taxi){
                System.out.println(vehiculo.toString() + " - es taxi");
            } else if (vehiculo instanceof BicicletaMontana) {
                System.out.println(vehiculo.toString() + " - es bicicleta de montaña");
            }
        });
    }
}
