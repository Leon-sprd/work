import net.sprd.qa.webdriver.common.Page;
import net.sprd.qa.webdriver.driver.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SpreadshirtIndexPage extends Page {

    private static final By SPRD_LOGO = By.cssSelector(".sprd-header__logo");

    protected SpreadshirtIndexPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickLogo() {
        // todo click on SPRD_Logo
    }

    @Override
    protected void waitForPageReady(RemoteWebDriver driver) {
        super.waitForPageReady(driver);
        driver.waitFor(ExpectedConditions.elementToBeClickable(SPRD_LOGO));
    }
}

