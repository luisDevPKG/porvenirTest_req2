package stepdefinitions;
// Importación de las bibliotecas necesarias para usar Cucumber y Serenity
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

// Importación de métodos estáticos de Serenity para manejar actores
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.actors.OnlineCast;
import screenplay.questions.ProductosEnCarro;
import screenplay.tasks.*;
import net.serenitybdd.screenplay.Actor;

public class AgradecimientosStepDefinitions {

    private Actor usuario; // Declaración del actor que representará al usuario en las pruebas
    private String path;   // Variable para almacenar la URL de la página principal

    private void PaginaPrincipal(String path) {
        // El actor intenta abrir la página principal usando la URL proporcionada
        usuario.attemptsTo(AbrirPaginaPrincipal.conUrl(path));
    }
    private void seleccionarCategoriaComun(String categoria) {
        // El actor intenta seleccionar la categoría especificada por el usuario
        usuario.attemptsTo(SeleccionarCategoria.seleccionarCategoria(categoria));
    }

    @io.cucumber.java.Before
    public void setTheStage() {
        // Configura el escenario inicial para el actor en la prueba
        OnStage.setTheStage(new OnlineCast());
        usuario = OnStage.theActorCalled("Usuario"); // El actor se llama "Usuario"
    }

    /* First scenario*/
    @Given("que estoy en la página principal de la tienda {string}")
    public void abrirPaginaPrincipal(String path) {
        PaginaPrincipal(path);
    }
    @When("selecciono la categoría {string}")
    public void seleccionarCategoria(String categoria) {
        seleccionarCategoriaComun(categoria);
    }
    @Then("se visualizarán los productos para esta categoría")
    public void se_visualizaran_los_productos_para_esta_categoria() {
        // El actor intenta validar que los productos sean visibles en la categoría seleccionada
        usuario.attemptsTo(ValidarProductosVisibles.enLaCategoria());
    }

    /* second scenario*/
    @Given("que estoy en la categoría {string}")
    public void seleccionarCategoriaDeNuevo(String categoria) {
        path = "https://www.floristeriamundoflor.com/";
        PaginaPrincipal(path);
        seleccionarCategoriaComun(categoria);
    }
    @When("hago clic en la opción \"Añadir al carrito\" para el primer producto")
    public void agregarPrimerProductosAlCarrito() throws InterruptedException {
        Thread.sleep(2000); // 5000 milisegundos = 5 segundos
        usuario.attemptsTo(AgregarProductoAlCarrito.primerProducto()); // Agrega el primer producto al carrito
    }
    @And("hago clic en la opción \"Añadir al carrito\" para el segundo producto")
    public void agregarSegundoProductosAlCarrito() {
        usuario.attemptsTo(AgregarProductoAlCarrito.segundoProducto()); // Agrega el segundo producto al carrito
    }
    @Then("el producto se agregará al carrito de compras")
    public void el_producto_se_agregara_al_carrito_de_compras() {
        usuario.attemptsTo(verCarrito.irAlCarrito());
        usuario.should(seeThat(new ProductosEnCarro())); // Verifica que los productos estén en el carrito
    }
}