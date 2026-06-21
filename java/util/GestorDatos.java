package util;

import model.Categoria;
import model.Tour;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Clase encargada de leer los datos desde el archivo.
 */
public class GestorDatos {

    /**
     * Lee el archivo tours.txt y crea una lista de objetos Tour.
     *
     * @return lista de tours
     */
    public ArrayList <Tour> cargarTours() {

        ArrayList <Tour> Tours = new ArrayList<>();

        try {

            InputStream archivo =
                    getClass().getClassLoader().getResourceAsStream("tours.txt");

            if (archivo == null) {
                throw new Exception("No se encontró el archivo.");
            }

            BufferedReader lector =
                    new BufferedReader(new InputStreamReader(archivo));

            String linea;

            while ((linea = lector.readLine()) != null) {

                try {

                String[] datos = linea.split(";");

                String nombre = datos[0];
                String categoriaTexto = datos[1];
                double precio = Double.parseDouble(datos[2]);

                Categoria categoria = new Categoria(categoriaTexto);

                Tour tour = new Tour(nombre, categoria, precio);

                Tours.add(tour);

                }catch (Exception e) {

                    System.out.println("Error procesando línea: " + linea);
                }
            }
            lector.close();

        } catch (Exception e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }

        return Tours;
    }
}
