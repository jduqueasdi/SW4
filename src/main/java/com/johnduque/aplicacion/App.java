package com.johnduque.aplicacion;

import com.johnduque.dominio.CuentaBancaria;
import com.johnduque.dominio.Persona;

public class App {
    public static void main(String[] args) {
        Persona perosnaUno = new Persona();

        perosnaUno.identidad = 1035789609;
        perosnaUno.nombre = "alejandro";

        CuentaBancaria cuentaUno = new CuentaBancaria();
        CuentaBancaria cuentaDos = new CuentaBancaria();

        cuentaUno.tipoDeCuenta = 'A';
        cuentaUno.numero = "1234";
        cuentaUno.propietarioCuenta = perosnaUno;

        cuentaDos.tipoDeCuenta = 'C';
        cuentaDos.numero = "5678";
        cuentaDos.propietarioCuenta = perosnaUno;

        System.out.println("El propietario de la cuenta " + cuentaUno.numero + " es: "
                + cuentaUno.propietarioCuenta.nombre);

        cuentaUno.saldo = 1;

        System.out.println("El saldo de la cuenta antes de consignar es: " + cuentaUno.saldo);

        cuentaUno.consignar(1000000);

        System.out.println("El saldo de la cuenta es:" + cuentaUno.saldo);
    }
}
