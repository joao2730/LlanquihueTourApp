package model;

/**
 * Representa una ruta gastronomica.
 */
public class RutaGastronomica extends ServicioTuristico{

    private int numeroDeParadas;

    public RutaGastronomica(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    public RutaGastronomica(int duracionHoras, String nombre, int numeroDeParadas) {
        super(duracionHoras, nombre);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return "--- Ruta Gastronómica ---\n" +
                super.toString() +
                "\nNúmero de paradas: " + numeroDeParadas;
    }
}
