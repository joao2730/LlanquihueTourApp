package model;

public class Vehiculo extends RecursoAgencia{

    private String patente;

    private String tipoVehiculo;

    public Vehiculo(String nombre, String patente) {
        super(nombre);
        this.patente = patente;
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String mostrarResumen() {
        return "Vehículo: " + getNombre() +
                " | Patente: " + patente;

    }
}
