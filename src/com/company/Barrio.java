package com.company;

import java.util.ArrayList;
import java.util.List;

public class Barrio extends Propiedad{

    private Integer factorMult;
    private List<Propiedad> propiedades;

    public Barrio(String calle, Integer numero, Integer factorMult) {
        super(calle, numero);
        this.factorMult = factorMult;
        propiedades = new ArrayList<>();
    }

    @Override
    public Double calcularImpuesto() {
        Double sumatoriaImp = 0.0;
        for (Propiedad propiedad : propiedades) {
            sumatoriaImp += propiedad.calcularImpuesto();
        }
        return sumatoriaImp * factorMult;
    }

    public void agregarPropiedad(String propiedad){
        propiedades.add(PropiedadesFactory.getInstance().crearPropiedad(propiedad));
    }

}
