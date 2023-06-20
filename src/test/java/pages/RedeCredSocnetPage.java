package pages;
import org.openqa.selenium.By;
import runner.RunTest;
import support.Utils;

public class RedeCredSocnetPage extends RunTest {

    public SocnetPage acessarBuscaSocnetPage() {
        Utils.waitElementBePresent(By.xpath("//div[4]/div/div/a/span/span"), 10);
        getDriver().findElement(By.xpath("//div[4]/div/div/a/span/span")).click();

        return new SocnetPage();
    }
}
