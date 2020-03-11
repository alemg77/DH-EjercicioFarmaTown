package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicio del programa DH-EjecicioFarmaTown");

        Droga unaDroga = new Droga("Coca cola");
        Droga otraDroga = new Droga("FernetBranca");
        Droga masDroga = new Droga("Aspirina");

        Medicamento unMedicamento = new Medicamento("FernetconCola",70);

        unMedicamento.agregarDrogra(unaDroga);
        unMedicamento.agregarDrogra(otraDroga);

        //  unMedicamento.mostrarTodasLasDrogras();

        unMedicamento.verificarAlergia(masDroga);
        unMedicamento.verificarAlergia(otraDroga);
    }
}
