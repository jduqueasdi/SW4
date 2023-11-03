package com.johnduque.interfac.aplicacion;

import com.johnduque.interfac.dominio.*;

import java.time.Year;

public class AplicacionCelular {
    public static void main(String[] args) {
        Persona yesenia = new Persona("Yesenia","YESENIA","ABC","123Y",123);
        Persona yenifer = new Persona("Yenifer","YENIFER","DEF","123C",456);
        Persona camilo = new Persona("Camilo","CAMILO","GHI","123C",789);

        CelularBasico iphone13 = new CelularConHuella("Iphone 13", yesenia);
        CelularBasico samsungX5 = new CelularConPatron("Samsung", yenifer);
        CelularBasico xiaomiRedmi12 = new CelularConHuellaYPatron("Xiaomi",camilo);

        desbloquearCelular(iphone13, yenifer);
        desbloquearCelular(samsungX5, yenifer);
        desbloquearCelular(xiaomiRedmi12, yenifer);
    }

    public static void desbloquearCelular(CelularBasico celular, Persona persona){
        boolean desbloqueo = celular.desbloquear(persona);

        if(desbloqueo){
            System.out.println("Desbloqueó " + persona.getNombre() + "-" + celular.getMarca());
        }else {
            System.out.println("No desbloqueó " + persona.getNombre() + "-" + celular.getMarca());
        }
    }
}
