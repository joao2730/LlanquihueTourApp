package model;

/**
 * Clase que representa un tour turístico.
 */
public class Tour {

    private String nombre;
    private Categoria categoria;
    private double precio;

    /**
     * Constructor.
     *
     * @param nombre Nombre del tour
     * @param categoria Tipo de tour
     * @param precio Precio del tour
     */
    public Tour(String nombre, Categoria categoria, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(String tipo) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio inválido.");
        }
    }

    /**
     * Muestra los datos del tour.
     *
     * @return informacion del tour
     */
    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", categotiria='" + categoria + '\'' +
                ", precio=" + precio +
                '}';
    }
}
