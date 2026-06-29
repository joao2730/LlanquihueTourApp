package ui;

import data.GestorServicios;

/**
 * Clase pricipal del programa.
 */
public class Main {

    public static void main(String[] args) {

        GestorServicios gestor = new GestorServicios();

        gestor.mostrarServicios();
    }
}
