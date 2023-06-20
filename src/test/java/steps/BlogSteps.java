package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import pages.BlogPage;
import runner.RunTest;
import support.ScreenshotUtils;

public class BlogSteps extends RunTest {

    BlogPage blogPage = new BlogPage();

    @Dado("^acesso o blog da SOC$")
    public void acesso_o_blog_da_SOC() {
        blogPage.acessarBlog();
    }

    @Quando("^eu realizo uma busca \"([^\"]*)\"$")
    public void eu_realizo_uma_busca(String busca) {
        blogPage.realizarBusca(busca);
    }

    @Quando("^acesso o menu Rede SOCNET$")
    public void acesso_o_menu_Rede_SOCNET() {
        blogPage.acessarRedeCredSocnet();
    }

}
