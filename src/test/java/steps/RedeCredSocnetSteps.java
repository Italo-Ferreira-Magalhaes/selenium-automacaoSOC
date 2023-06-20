package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.E;
import pages.RedeCredSocnetPage;
import runner.RunTest;
import support.ScreenshotUtils;

public class RedeCredSocnetSteps extends RunTest {

    RedeCredSocnetPage redeCredSocnetPage = new RedeCredSocnetPage();

    @E("^acesso a busca Rede Credenciado SOCNET$")
    public void acesso_a_busca_rede_credenciado_socnet() {
        redeCredSocnetPage.acessarBuscaSocnetPage();
    }
}
