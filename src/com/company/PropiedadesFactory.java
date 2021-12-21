package com.company;

public class PropiedadesFactory {

    private static PropiedadesFactory instance;

    private PropiedadesFactory(){}

    public static PropiedadesFactory getInstance(){
        if(instance == null){
            instance = new PropiedadesFactory();
        }
            return instance;
    }

    public Propiedad crearPropiedad(String propieda){
        switch (propieda){
            case "Av. San Martín" :
                return new Casa("Av. San Martín", 130, 500.0);
            case "Mitre" :
                return new Casa("Mitre", 233, 700.0);
            case "Gutierres" :
                Barrio barrio1 = new Barrio("Gutierres", 300, 2);
                barrio1.agregarPropiedad("Av. San Martín");
                barrio1.agregarPropiedad("Mitre");
                return barrio1;
            default:
                return null;
        }


    }

}
