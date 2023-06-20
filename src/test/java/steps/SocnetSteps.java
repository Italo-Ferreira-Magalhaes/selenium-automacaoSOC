package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import pages.SocnetPage;
import runner.RunTest;
import support.ScreenshotUtils;

public class SocnetSteps extends RunTest {

    SocnetPage socnetPages = new SocnetPage();

    @E("^realizo a busca do credenciado \"([^\"]*)\"$")
    public void realizo_a_busca_do_credenciado(String busca) {
        socnetPages.clicarEmpresa();
        socnetPages.buscarEmpresa(busca);
    }

    @E("^acesso o perfil do credenciado$")
    public void acesso_o_perfil_do_credenciado() {
        socnetPages.acessarPerfilCredenciado();
    }

    @Então("^valido o nome do credenciado \"([^\"]*)\"$")
    public void valido_o_nome_do_credenciado(String nome_credenciado) {
        socnetPages.validarNomeDoCredenciado(nome_credenciado);
    }

    @E("^valido o CNPJ do credenciado \"([^\"]*)\"$")
    public void valido_o_cnpj_do_credenciado(String cnpj_credenciado) {
        socnetPages.validarCNPJDoCredenciado(cnpj_credenciado);
    }

    @After
    public static void takeScreenshotAfterScenario(Scenario scenario) {
        ScreenshotUtils.addScreenshotOnScenario(scenario);
    }

}
