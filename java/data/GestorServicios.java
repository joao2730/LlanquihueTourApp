package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

/**
 * Crea objetos de prueba.
 */
public class GestorServicios {

    public void mostrarServicios() {

        //Rutas gastronómicas
        RutaGastronomica ruta1 = new RutaGastronomica(5, "Sabores del Sur", 6);

        RutaGastronomica ruta2 = new RutaGastronomica(4, "Ruta Cervecera", 5);

        //Paseo lacustres
        PaseoLacustre paseo1 = new PaseoLacustre(3, "Lago LLanquihue", "Catamarán");

        PaseoLacustre paseo2 = new PaseoLacustre(2, "Todos los Santos", "Lancha");

        //Excursiones culturales
        ExcursionCultural excursion1 = new ExcursionCultural(4, "Patrimonio Aléman", "Museo Colonial");

        ExcursionCultural excursion2 = new ExcursionCultural(3, "Puerto Varas Histórico", "Iglesia del Sagrado Corazón");

        System.out.println(ruta1);
        System.out.println();

        System.out.println(ruta2);
        System.out.println();

        System.out.println(paseo1);
        System.out.println();

        System.out.println(paseo2);
        System.out.println();

        System.out.println(excursion1);
        System.out.println();

        System.out.println(excursion2);
    }
}
