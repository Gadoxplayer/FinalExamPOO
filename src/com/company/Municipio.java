package com.company;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

    private List<Propiedad> propiedades;

    public Municipio() {
        propiedades = new ArrayList<>();
    }

    public void mostrarPropiedad() {
        for (Propiedad propiedad : propiedades) {
            System.out.println(propiedad);
        }
    }

    public void agregarPropiedad(String propieda) {
        propiedades.add(PropiedadesFactory.getInstance().crearPropiedad(propieda));
    }
}