package screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoCompras {

    public static final Target BOTON1 = Target.the("Carro compras").
            locatedBy("//a[contains(@title,'Ver su carrito de compras')]");

    public static final Target BOTON2 = Target.the("Ir a ver el carrito").
            locatedBy("//a[contains(@title,'Ver su carrito de compras')]"); // To Do este selector es ambiguo y puede cambiarse o dejar uno solo
    public static final Target VER_CARRITO = Target.the("Ver Carrito").
            locatedBy("//div[@class='table-responsive']");
}