package screenplay.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hover;
import screenplay.ui.CategoriaAgradecimientosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;


public class AgregarProductoAlCarrito implements Task {

    private final Target producto;

    // Constructor que recibe el producto como parámetro
    public AgregarProductoAlCarrito(Target producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Hover.over(producto),
                Click.on(producto),
                Click.on(CategoriaAgradecimientosProductos.BOTON_AGREGAR)
        );
    }

    // Crea las instancias del Task para cada producto
    public static AgregarProductoAlCarrito primerProducto() {
        return new AgregarProductoAlCarrito(CategoriaAgradecimientosProductos.PRIMER_PRODUCTO);
    }

    public static AgregarProductoAlCarrito segundoProducto() {
        return new AgregarProductoAlCarrito(CategoriaAgradecimientosProductos.SEGUNDO_PRODUCTO);
    }
}
