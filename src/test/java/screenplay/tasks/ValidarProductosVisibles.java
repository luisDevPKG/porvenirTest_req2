package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.hamcrest.CoreMatchers.is;
import screenplay.ui.VerProductosCategoria;

public class ValidarProductosVisibles implements Task {

    private final Target productosCategoria; // Almacena el selector de la categoría de productos

    // Constructor que recibe el Target para validar los productos visibles
    public ValidarProductosVisibles(Target productosCategoria) {
        this.productosCategoria = productosCategoria;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // El actor realiza la acción de verificar la visibilidad de los productos
        actor.should(seeThat("Los productos son visibles",
                Visibility.of(productosCategoria).asBoolean(), is(true)));
    }
    // crea una instancia de la tarea con el selector específico para la categoría
    public static ValidarProductosVisibles enLaCategoria() {
        return instrumented(ValidarProductosVisibles.class, VerProductosCategoria.PRODUCTOS_CATEGORIA_AGRADECIMIENTOS);
    }
}