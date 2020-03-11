package com.company;

import java.util.ArrayList;

public class Medicamento {

    public String nombreMedicamento;
    public ArrayList<Droga> listaDeDrogras;
    public Integer precio;

    public Medicamento(String nombreMedicamento, Integer precio) {
        this.nombreMedicamento = nombreMedicamento;
        this.listaDeDrogras = new ArrayList();
        this.precio = precio;
    }

    public void verificarAlergia ( Droga unaDroga){
        for (Droga listaDeDrogra : listaDeDrogras) {
            if ( listaDeDrogra.getNombre().equals(unaDroga.getNombre()))
            {
                System.out.println("No podes usar "+this.nombreMedicamento+" porque contiene "+unaDroga.getNombre());
                return;
            }
        }
        System.out.println("Poder usar "+this.nombreMedicamento+" sin problemas porque no tiene "+unaDroga.getNombre());
    }

    public void agregarDrogra ( Droga unaDroga){
        listaDeDrogras.add(unaDroga);
    }

    public void eleminarDroga ( Droga unaDroga){
        // TODO: Esto no se aun como se hace
    }

    public void mostrarTodasLasDrogras () {
        System.out.println("Nombre del Medicamento: "+this.nombreMedicamento);
        for (Droga listaDeDrogra : listaDeDrogras) {
            System.out.println("    "+listaDeDrogra.getNombre());
        }
    }

}
