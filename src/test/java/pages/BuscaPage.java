package pages;

import org.openqa.selenium.By;
import static org.junit.Assert.*;
import runner.RunTest;

public class BuscaPage extends RunTest {

    public BuscaPage validarBusca(String busca) {
        String texto_busca = getDriver().findElement(By.xpath("//h2[contains(.,'Resultados da Pesquisa por: ')]")).getText();
        assertEquals("Resultados da Pesquisa por: " + busca, texto_busca);
        assertEquals("Busca não trouxe resultado esperado", true, getDriver().findElement(By.xpath("//a[contains(@href, 'https://www.soc.com.br/formacao-super-soc/')]")).isDisplayed());

        return this;
    }
}
