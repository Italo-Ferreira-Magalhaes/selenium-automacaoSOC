package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import static org.junit.Assert.*;
import runner.RunTest;


public class BlogPage extends RunTest {

    public BlogPage acessarBlog() {
        getDriver("chrome").get("https://ww2.soc.com.br/blog/");
        getDriver().manage().window().maximize();
        assertEquals("Não acessou o Blog",true, getDriver().findElement(By.xpath("(//input[@name='s'])[3]")).isDisplayed());

        return this;
    }

    public BuscaPage realizarBusca(String busca) {
        getDriver().findElement(By.xpath("(//input[@name='s'])[3]")).sendKeys(busca, Keys.ENTER);

        return new BuscaPage();
    }

    public RedeCredSocnetPage acessarRedeCredSocnet() {
        getDriver().findElement(By.linkText("Rede SOCNET")).click();

        return new RedeCredSocnetPage();
    }
}
