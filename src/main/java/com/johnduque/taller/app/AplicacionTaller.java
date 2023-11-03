package com.johnduque.taller.app;

import com.johnduque.taller.dominio.Bicicleta;
import com.johnduque.taller.dominio.Bus;
import com.johnduque.taller.dominio.Carro;
import com.johnduque.taller.dominio.Taller;

public class AplicacionTaller {
    public static void main(String[] args) {
        Taller autolarte = new Taller();

        Carro carro = new Carro(123,"Mazda",false);
        Bus bus = new Bus(456, "Ranult",false);
        Bicicleta bici = new Bicicleta(111,"Shimano",false);

        autolarte.ingresar(carro);
        autolarte.ingresar(bus);
        autolarte.ingresar(bici);

        System.out.println(autolarte.listar());
    }
}
