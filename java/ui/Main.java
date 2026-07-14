package ui;

import data.GestorEntidades;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.*;

/**
 * Clase pricipal del programa.
 */
public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();

        try {
            //Guía
            String nombreGuia = JOptionPane.showInputDialog("Nombre del Guia: ");

            if (nombreGuia == null || nombreGuia.trim().isEmpty()) {
                throw new Exception("El nombre del guía no puede estar vacío.");
            }

            String especialidad = JOptionPane.showInputDialog("Especialidad del Guia: ");

            if (especialidad == null || especialidad.trim().isEmpty()) {
                throw new Exception("La especialidad no puede estar vacía.");
            }

            GuiaTuristico guia = new GuiaTuristico(nombreGuia, especialidad);
            gestor.agregar(guia);

            //Vehiculo
            String nombreVehiculo = JOptionPane.showInputDialog("Nombre del Vehiculo: ");

            if (nombreVehiculo == null || nombreVehiculo.trim().isEmpty()) {
                throw new Exception("El nombre del vehículo no puede estar vacío.");
            }

            String patente = JOptionPane.showInputDialog("Patente: ");

            if (patente == null || patente.trim().isEmpty()) {
                throw new Exception("La patente no puede estar vacía.");
            }

            Vehiculo vehiculo = new Vehiculo(nombreVehiculo, patente);
            gestor.agregar(vehiculo);

            //Mostrar el resumen utilizando el método de la interfaz
            String resumen = guia.mostrarResumen() + "\n\n" + vehiculo.mostrarResumen();

            JOptionPane.showMessageDialog(null, resumen, "Resumen de entidades registradas", JOptionPane.INFORMATION_MESSAGE);

            //Tambien se muestra en la consola
            gestor.mostrarEntidades();

        }catch(Exception e){

            JOptionPane.showMessageDialog(null, "Error: ", e.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }
}
