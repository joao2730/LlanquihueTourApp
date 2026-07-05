package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;
import java.util.List;

/**
 * Crea objetos de prueba.
 */
public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

        servicios.add(new RutaGastronomica(
                5, "Sabores del Sur", 6));

        servicios.add(new RutaGastronomica(
                4, "Ruta Cervecera", 5));

        servicios.add(new PaseoLacustre(
                3, "Lago LLanquihue", "Catamarán"));

        servicios.add(new PaseoLacustre(
                2, "Todos los Santos", "Lancha"));

        servicios.add(new ExcursionCultural(
                4, "Patrimonio Alemán", "Museo Colonial"));

        servicios.add(new ExcursionCultural(
                3, "Puerto Varas Histórico", "Iglesia del Sagrado Corazón"));
    }

    public List<ServicioTuristico> obtenerServicios() {
        return servicios;
    }
}
