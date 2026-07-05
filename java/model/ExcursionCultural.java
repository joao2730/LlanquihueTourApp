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
    public void mostrarInformacion() {

        System.out.println("--- Excursión Cultural ---");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Duracion: " + getDuracionHoras() + " horas");
        System.out.println("Lugar Histórico: " + lugarHistorico);
        System.out.println("----------------");
    }
}
