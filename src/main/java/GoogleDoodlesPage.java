import net.sprd.qa.webdriver.common.Page;
import net.sprd.qa.webdriver.driver.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GoogleDoodlesPage extends Page {

    protected GoogleDoodlesPage(RemoteWebDriver driver) {
        super(driver);
    }

    @Override
    protected void waitForPageReady(RemoteWebDriver driver) {
        super.waitForPageReady(driver);

        driver.waitFor(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#logo")));

    }
}
