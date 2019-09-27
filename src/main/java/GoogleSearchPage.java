import net.sprd.qa.webdriver.common.Page;
import net.sprd.qa.webdriver.driver.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class GoogleSearchPage extends Page {

    private static final By SEARCH_BUTTON = By.cssSelector("input[type='submit'][name='btnK']");
    private static final By RANDOM_SEARCH_BUTTON = By.cssSelector("input[type='submit'][name='btnI']");
    private static final By SEARCH_FIELD = By.cssSelector("input[title='Suche']");


    public GoogleSearchPage(RemoteWebDriver driver) {
        super(driver);
    }

    public GoogleSearchPage enterSearchTerm(String searchTerm) {
        WebElement textField = driver.findElement(SEARCH_FIELD);
        textField.sendKeys(searchTerm);

        return this;
    }

    public GoogleListPage search() {

        driver.waitFor(ExpectedConditions.elementToBeClickable(SEARCH_BUTTON));

        List<WebElement> buttons = driver.findElements(SEARCH_BUTTON);

        for (int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).isDisplayed()) {
                buttons.get(i).click();
                break;
            }
        }

        return new GoogleListPage(driver);
    }

    public void searchRandom() {
        List<WebElement> buttons = driver.findElements(RANDOM_SEARCH_BUTTON);

        for (int i = 0; i < buttons.size(); i++) {
            if (buttons.get(i).isDisplayed()) {
                buttons.get(i).click();
                break;
            }
        }
    }

    @Override
    protected void waitForPageReady(RemoteWebDriver driver) {
        super.waitForPageReady(driver);
    }
}
