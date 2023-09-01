package com.johnduque.ejemplodiagrama.dominio;

import java.util.ArrayList;

public class Nota {

    private double notaParcial;
    private double notaFinal;
    private ArrayList<Double> notasSeguimiento;
    private Asignatura materia;

    public Nota(double notaParcial, double notaFinal, Asignatura materia) {
        this.notaParcial = notaParcial;
        this.notaFinal = notaFinal;
        this.materia = materia;
        this.notasSeguimiento = new ArrayList<>();
    }

    public Nota(Asignatura materia) {
        this.materia = materia;
    }

    private double calcularSeguimiento(){
        double sumaNotas = this.notasSeguimiento.
                stream().mapToDouble(nota ->
                        nota.doubleValue()).sum();
        return sumaNotas/notasSeguimiento.size();
    }

    public double calcularDefinitiva(){
        return (this.notaParcial*0.3)+
                (this.notaFinal*0.3)+
                (calcularSeguimiento()*0.4);
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public ArrayList<Double> getNotasSeguimiento() {
        return notasSeguimiento;
    }

    public Asignatura getMateria() {
        return materia;
    }
}
