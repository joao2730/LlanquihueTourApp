package model;

/**
 * Superclase que representa un servicio turístico.
 */
public class ServicioTuristico {

    private String nombre;
    private int duracionHoras;

    public ServicioTuristico() {
    }

    public ServicioTuristico(int duracionHoras, String nombre) {
        this.duracionHoras = duracionHoras;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nDuracion: " + duracionHoras + " horas";
    }
}
