package com.johnduque.dominio;

import java.util.Date;

public class CuentaBancaria {

    public Banco banco;
    public String numero;
    public char tipoDeCuenta;
    public Persona propietarioCuenta;
    public float saldo;
    public Date fechaDeCreacion;

    public boolean retirar(float valorRetirar){
        if(this.saldo >= valorRetirar){
            this.saldo -= valorRetirar;
            return true;
        }else{
            return false;
        }
    }

    public void consignar(float valorAConsignar){
        this.saldo += valorAConsignar;
    }

    public String obtenerTipoCuenta(){
        String descripcion = null;

        switch (this.tipoDeCuenta){
            case 'A' :
                descripcion = "Ahorros";
                break;
            case 'C' :
                descripcion = "Corriente";
                break;
            default:
                descripcion = "Ninguna";
                break;
        }
        return descripcion;
    }

    public boolean transferir(CuentaBancaria cuentaBancariaDestino, float valorATransferir){
        if(this.saldo >= valorATransferir){
            this.retirar(valorATransferir);
            cuentaBancariaDestino.consignar(valorATransferir);
            return true;
        }else {
            return false;
        }
    }
}
