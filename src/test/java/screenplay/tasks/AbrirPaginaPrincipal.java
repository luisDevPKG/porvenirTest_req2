package screenplay.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaPrincipal implements Task {

    private final String path;
    public AbrirPaginaPrincipal(String path) {
        this.path = path;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(path));
    }

    public static AbrirPaginaPrincipal conUrl(String path) {
        return new AbrirPaginaPrincipal(path);
    }
}