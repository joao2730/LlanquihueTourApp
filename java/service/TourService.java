package service;

import model.Tour;

import java.util.ArrayList;

/**
 * Gestiona operaciones sobre los tours.
 */
public class TourService {

    private ArrayList<Tour> tours;

    public TourService(ArrayList<Tour> tours) {
        this.tours = tours;
    }

    /**
     * Mostrar todos los tours.
     */
    public void mostrarTours() {

        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    /**
     * Buscar tours por categoría.
     */
    public void buscarPorCategoria(String categoria) {

        System.out.println("\nTours categoría: " + categoria);

        boolean encontrado = false;

        for (Tour tour: tours) {

            if (tour.getCategoria()
                    .getNombre()
                    .equalsIgnoreCase(categoria)) {

                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron tours.");
        }
    }

    /**
     * Buscar tours sobre un precio determinado.
     */
    public void buscarPorPrecio(double precioMinimo) {

        System.out.println("\nTours con precio superior a " + precioMinimo);

        for (Tour tour : tours) {

            if (tour.getPrecio() > precioMinimo) {
                System.out.println(tour);
            }
        }
    }
}
