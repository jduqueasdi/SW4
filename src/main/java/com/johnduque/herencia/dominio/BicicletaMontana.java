package com.johnduque.herencia.dominio;

public final class BicicletaMontana extends Bicicleta{
    private String tipoSuspension;

    public BicicletaMontana(String marca, String linea, short anioModelo, String tipoFreno, String tipoSuspension) {
        super(marca, linea, anioModelo, tipoFreno);
        this.tipoSuspension = tipoSuspension;
    }

    @Override
    public void acelerar() {
        System.out.println("La bicicleta de montaña no acelera como el taxi");
    }

    public String getTipoSuspension() {
        return tipoSuspension;
    }

    public void setTipoSuspension(String tipoSuspension) {
        this.tipoSuspension = tipoSuspension;
    }


}
