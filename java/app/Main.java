package app;

import model.Tour;
import service.TourService;
import util.GestorDatos;

import java.util.ArrayList;

/**
 * Clase pricipal del programa.
 */
public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        ArrayList <Tour> tours = gestor.cargarTours();

        TourService servicio = new TourService(tours);

        System.out.println("=== Todos los Tours ===");

        servicio.mostrarTours();

        System.out.println();

        servicio.buscarPorCategoria("Cultural");

        System.out.println();

        servicio.buscarPorPrecio(35000);
    }
}
