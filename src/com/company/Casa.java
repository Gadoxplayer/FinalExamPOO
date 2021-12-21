package com.company;

public class Casa extends Propiedad{

    private Double baseImpuesto;

    public Casa(String calle, Integer numero, Double baseImpuesto) {
        super(calle, numero);
        this.baseImpuesto = baseImpuesto;
    }

    @Override
    public Double calcularImpuesto() {
        if(getCalle().equals("Av. San Martín")){
            return baseImpuesto + (baseImpuesto*0.1);
        } return baseImpuesto;
    }
}
