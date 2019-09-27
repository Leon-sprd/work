import net.sprd.qa.webdriver.common.Page;
import net.sprd.qa.webdriver.driver.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class GoogleListPage extends Page {
    public static final String SEARCH_RESULT_LINKS = ".g div.r > a";

    public GoogleListPage(RemoteWebDriver driver) {
        super(driver);
    }


    public List<WebElement> getSearchResultLinks() {
        return driver.findElements(By.cssSelector(SEARCH_RESULT_LINKS));
    }

    public void clickLink(WebElement link) {
        link.click();
    }



    @Override
    protected void waitForPageReady(RemoteWebDriver driver) {
        super.waitForPageReady(driver);
        driver.waitFor(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".logo")));
    }


}
