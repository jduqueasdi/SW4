package com.johnduque.ejemplodiagrama.aplicacion;

import com.johnduque.ejemplodiagrama.dominio.Asignatura;
import com.johnduque.ejemplodiagrama.dominio.Docente;
import com.johnduque.ejemplodiagrama.dominio.Estudiante;
import com.johnduque.ejemplodiagrama.dominio.Nota;

public class App {
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura("SW4");
        Docente profesor = new Docente("1234","John Duque");

        Estudiante brayan = new Estudiante("1","Brayan");
        Estudiante yesenia = new Estudiante("2","Yesenia");

        Nota notaBrayan = new Nota(5,5,asignatura);
        notaBrayan.getNotasSeguimiento().add(5.0);
        notaBrayan.getNotasSeguimiento().add(4.0);
        notaBrayan.getNotasSeguimiento().add(3.0);
        notaBrayan.getNotasSeguimiento().add(5.0);

        double definitiva = notaBrayan.calcularDefinitiva();
        if(definitiva >= 3.5){
            System.out.println(brayan.getNombre() + " ganó");
        }else {
            System.out.println(brayan.getNombre() + " perdió");
        }
    }
}
