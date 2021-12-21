package com.company;

public abstract class Propiedad {

    private String calle;
    private Integer numero;

    public Propiedad(String calle, Integer numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public abstract Double calcularImpuesto();

    public String getCalle() {
        return calle;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "calle='" + calle + '\'' +
                ", numero=" + numero +
                '}' + " Impuesto valor: " + calcularImpuesto();
    }
}
