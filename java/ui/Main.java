package ui;

import data.GestorServicios;
import model.ServicioTuristico;

/**
 * Clase pricipal del programa.
 */
public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        System.out.println("--- SERVICIOS TURÍSTICOS ---\n");

        for (ServicioTuristico servicio : gestor.obtenerServicios()) {

            servicio.mostrarInformacion();
        }
    }
}
