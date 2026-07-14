package data;

import model.*;

import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> entidades = new ArrayList<>();

    public void agregar(Registrable r) {
        entidades.add(r);
    }

    public void mostrarEntidades() {

        for (Registrable r : entidades) {

            System.out.println(r.mostrarResumen());

            if (r instanceof GuiaTuristico){
                System.out.println("Tipo: Guia Turistico");
            }

            if (r instanceof Vehiculo){
                System.out.println("Tipo: Vehiculo");
            }

            System.out.println();
        }
    }
}
