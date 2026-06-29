package model;

/**
 * Representa una excursion cultural.
 */
public class ExcursionCultural extends ServicioTuristico{

    private String lugarHistorico;

    public ExcursionCultural(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    public ExcursionCultural(int duracionHoras, String nombre, String lugarHistorico) {
        super(duracionHoras, nombre);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return "--- Excursión Cultural ---\n" +
                super.toString() +
                "\nLugar histórico: " + lugarHistorico;
    }
}
