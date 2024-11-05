package screenplay.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import screenplay.ui.CarritoCompras;

public class ProductosEnCarro implements Question<Boolean> {
    // Método que responde a la pregunta sobre la visibilidad del carrito de compras
    @Override
    public Boolean answeredBy(Actor actor) {
        // Resuelve el elemento de la UI que representa el carrito y verifica si es visible para el actor
        return CarritoCompras.VER_CARRITO.resolveFor(actor).isVisible();
    }
}