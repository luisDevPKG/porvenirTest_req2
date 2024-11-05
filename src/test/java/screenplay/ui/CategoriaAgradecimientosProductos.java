package screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CategoriaAgradecimientosProductos {

    public static final Target PRIMER_PRODUCTO = Target.the("Primer producto").
            locatedBy("//div[contains(@data-product-id,'4079')]");
    public static final Target SEGUNDO_PRODUCTO = Target.the("Segundo producto").
            locatedBy("//a[contains(@title,'Botella de vino gato negro 750 ml')]");

    public static final Target BOTON_AGREGAR = Target.the("Agregar").
            locatedBy("//button[contains(.,'Añadir al carrito')]");
}