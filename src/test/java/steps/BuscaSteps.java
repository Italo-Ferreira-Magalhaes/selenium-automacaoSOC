package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Então;
import pages.BuscaPage;
import runner.RunTest;
import support.ScreenshotUtils;


public class BuscaSteps extends RunTest {

    BuscaPage buscaPage = new BuscaPage();

    @Então("^valido o resultado da busca por \"([^\"]*)\" \"([^\"]*)\"$")
    public void valido_o_resultado_da_busca(String busca, String link) {
        buscaPage.validarBusca(busca, link);
    }
}
