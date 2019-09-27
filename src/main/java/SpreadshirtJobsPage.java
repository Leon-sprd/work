import net.sprd.qa.webdriver.common.Page;
import net.sprd.qa.webdriver.driver.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SpreadshirtJobsPage extends Page{

    private static final By SPRD_LOGO = By.cssSelector(".sprd-header__logo");


    protected SpreadshirtJobsPage(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickLogo() {
        driver.findElement(SPRD_LOGO).click();
    }

    @Override
    protected void waitForPageReady(RemoteWebDriver driver) {
        super.waitForPageReady(driver);

        driver.waitFor(ExpectedConditions.elementToBeClickable(SPRD_LOGO));
    }
}
