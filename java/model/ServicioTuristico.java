package model;

/**
 * Superclase que representa un servicio turístico.
 */
public abstract class ServicioTuristico {

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

    /**
     * Método que será sobrescrito por cada subclase.
     */
    public abstract void mostrarInformacion();
    }

