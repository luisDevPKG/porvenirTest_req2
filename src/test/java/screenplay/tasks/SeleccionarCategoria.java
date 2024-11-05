package screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.ui.CategoriaAgradecimientos;

public class SeleccionarCategoria {
    //crea una tarea que permite seleccionar una categoría específica
    public static Task seleccionarCategoria(String nombreCategoria) {
        // Definición de la tarea donde se indica qué acción se realizará
        // {0} marcador para el actor, se sustituye {0} por el nombre del actor
        return Task.where("{0} selecciona la categoría " + nombreCategoria,
                // Acción de clic sobre el elemento que representa la categoría seleccionada
                Click.on(CategoriaAgradecimientos.CATEGORIA_AGRADECIMIENTOS(nombreCategoria))
        );
    }
}
