package screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CategoriaAgradecimientos {

    public static Target CATEGORIA_AGRADECIMIENTOS(String nombreCategoria) {
        return Target.the("Categoría " + nombreCategoria)
                .located(By.xpath("//a[@href='https://www.floristeriamundoflor.com/product-category/agradecimientos/'][contains(.,'Agradecimientos')]"));
    }
}