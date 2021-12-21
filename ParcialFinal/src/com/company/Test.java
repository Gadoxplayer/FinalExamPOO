package com.company;

public class Test {
    public static void main(String[] args) {

        Municipio municipio1 = new Municipio();
        municipio1.agregarPropiedad("Av. San Martín");
        municipio1.agregarPropiedad("Mitre");
        municipio1.agregarPropiedad("Gutierres");

        municipio1.mostrarPropiedad();

    }
}
