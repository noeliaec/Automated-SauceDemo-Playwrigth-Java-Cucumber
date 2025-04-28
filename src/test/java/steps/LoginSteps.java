package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("que el usuario abre la página de Sauce Demo")
    public void queElUsuarioAbreLaPáginaDeSauceDemo() {
        loginPage.abrirHome();
    }

    @When("ingresa {string} y {string}")
    public void ingresaY(String user, String pass) {
        loginPage.hacerLogin(user, pass);
    }

    @Then("debería ver la lista de productos")
    public void deberíaVerLaListaDeProductos() {
        loginPage.validarInventario();
    }

    @Then("debería ver un mensaje de error indicando credenciales incorrectas")
    public void deberíaVerUnMensajeDeErrorIndicandoCredencialesIncorrectas() {
        loginPage.loginFallido();
    }
}
