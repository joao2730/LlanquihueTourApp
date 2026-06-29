package model;

/**
 * Representa un paseo lacustre.
 */
public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public PaseoLacustre(int duracionHoras, String nombre, String tipoEmbarcacion) {
        super(duracionHoras, nombre);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return "--- Paseo Lacustre ---\n" +
                super.toString() +
                "\nTipo de embarcacion: " + tipoEmbarcacion;
    }
}
