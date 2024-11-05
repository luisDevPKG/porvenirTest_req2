package stepdefinitions;
// Importación de las bibliotecas necesarias para usar Cucumber y Serenity
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

// Importación de métodos estáticos de Serenity para manejar actores
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.actors.OnlineCast;
import screenplay.tasks.AbrirPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebDriver;
import screenplay.tasks.SeleccionarCategoria;
import org.junit.Before;
import screenplay.tasks.ValidarProductosVisibles;

public class AgradecimientosStepDefinitions {

    private Actor usuario; // Declaración del actor que representará al usuario en las pruebas

    @io.cucumber.java.Before
    public void setTheStage() {
        // Configura el escenario inicial para el actor en la prueba
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("Usuario"); // El actor se llama "Usuario"
    }

    /* First scenario*/
    @Given("que estoy en la página principal de la tienda {string}")
    public void abrirPaginaPrincipal(String path) {
        // El actor intenta abrir la página principal usando la URL proporcionada
        usuario.attemptsTo(AbrirPaginaPrincipal.conUrl(path));
    }
    @When("selecciono la categoría {string}")
    public void seleccionarCategoria(String categoria) {
        // El actor intenta seleccionar la categoría especificada por el usuario
        usuario.attemptsTo(SeleccionarCategoria.seleccionarCategoria(categoria)
        );
    }
    @Then("se visualizarán los productos para esta categoría")
    public void se_visualizaran_los_productos_para_esta_categoria() {
        // El actor intenta validar que los productos sean visibles en la categoría seleccionada
        usuario.attemptsTo(ValidarProductosVisibles.enLaCategoria());
    }
}