package screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;

public class VerProductosCategoria {
    // Selector para verificar que los productos de la categoría "Agradecimientos" están visibles
    public static final Target PRODUCTOS_CATEGORIA_AGRADECIMIENTOS = Target.the("Productos de la categoría Agradecimientos")
            // Definición del selector utilizando XPath para localizar el elemento en la página
            .locatedBy("//div[@class='products products-grid']");
}