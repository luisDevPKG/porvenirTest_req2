package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.ui.CarritoCompras;

public class verCarrito implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Hacer clic en los botones para ir al carrito
        actor.attemptsTo(
                Click.on(CarritoCompras.BOTON1),
                Click.on(CarritoCompras.BOTON2)
        );
    }
    public static verCarrito irAlCarrito() {
        return new verCarrito();
    }
}