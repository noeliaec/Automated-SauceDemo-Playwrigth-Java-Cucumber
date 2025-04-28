package pages;

import com.core.utility.MasterPage;
import org.assertj.core.api.SoftAssertions;
import static locators.LoginLocators.*;

public class LoginPage extends MasterPage {

    SoftAssertions softAssertions = new SoftAssertions();


    public void abrirHome() {
        auto_openURLInBrowser();
    }

    public void hacerLogin(String user, String pass) {
        auto_setTextToInput(USER_BUTTON, user);
        auto_setTextToInput(PASS_BUTTON, pass);
        auto_setClickElement(LOGIN_BUTTON);
    }

    public void validarInventario() {
        softAssertions.assertThat(page.isVisible(INVENTORY_BUTTON))
                .as("La lista de inventario debería ser visible tras el login")
                .isTrue();

        softAssertions.assertAll();    }
}
