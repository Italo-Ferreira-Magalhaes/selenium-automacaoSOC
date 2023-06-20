package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.Assert.*;
import runner.RunTest;
import support.Utils;

import javax.rmi.CORBA.Util;


public class SocnetPage extends RunTest {

    public SocnetPage clicarEmpresa() {
        Utils.waitElementBePresent(By.xpath("//span[contains(.,'Empresa')]"), 10);
        getDriver().findElement(By.xpath("//span[contains(.,'Empresa')]")).click();

        return this;
    }

    public SocnetPage buscarEmpresa(String busca) {
        getDriver().findElement(By.id("ipt-busca-credenciado-2")).sendKeys(busca, Keys.ENTER);

        return this;
    }

    public SocnetPage acessarPerfilCredenciado() {
        Utils.waitElementBePresent(By.xpath("//img[@alt='Logo da empresa']"),10);
        getDriver().findElement(By.xpath("//img[@alt='Logo da empresa']")).click();
        getDriver().findElement(By.cssSelector(".btn-estreito")).click();

        return this;
    }

    public SocnetPage validarNomeDoCredenciado(String credenciado) {
        Utils.waitElementBePresent(By.cssSelector(".detalhe-nome"), 10);
        String nome_credenciado = getDriver().findElement(By.cssSelector(".detalhe-nome")).getText();
        assertEquals(credenciado, nome_credenciado);

        return this;
    }

    public SocnetPage validarCNPJDoCredenciado(String cnpj) {
        String cnpj_credenciado = getDriver().findElement(By.cssSelector(".cnpj-empresa")).getText();
        assertEquals(cnpj, cnpj_credenciado);

        return this;
    }
}
