package com.johnduque.ejemplodiagrama.dominio;

import java.util.ArrayList;

public class Nota {

    private static final double PORC_SEGUIMIENTO = 0.4;
    private static final double PORC_FINAL = 0.3;
    private static final double PORC_PARCIAL = 0.3;
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
        return (this.notaParcial*Nota.PORC_PARCIAL)+
                (this.notaFinal*Nota.PORC_FINAL)+
                (calcularSeguimiento()*Nota.PORC_SEGUIMIENTO);
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
