import net.sprd.qa.webdriver.WebTest;
import net.sprd.qa.webdriver.driver.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InstallationTest extends WebTest {

    public static final String SEARCH_RESULT_LINKS = ".g div.r > a";
    private static final By SPRD_LOGO = By.cssSelector(".sprd-header__logo");


    @BeforeSuite
    public void setUp() throws Exception {
        System.setProperty("local", "true");
        System.setProperty("headless", "false");
        System.setProperty("browserPath", "/Users/leon/bin/chromedriver");
    }

    @Test
    public void testSearchByGoogle() throws Exception {
        testFirstGoogleResult("immanuel kant gymnasium teltow", "http://www.gymnasium-teltow.de/");
    }

    @Test
    public void testSearchSpreadshirt() throws Exception {
        testFirstGoogleResult("Spreadshirt", "https://www.spreadshirt.de/");
    }


    @Test
    public void testRandomSearchByGoogle() throws Exception {
        RemoteWebDriver driver = d();
        driver.get("https://www.google.de");
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.searchRandom();

        GoogleDoodlesPage googleDoodlesPage = new GoogleDoodlesPage(driver);

        assertThat(driver.getCurrentUrl()).isEqualTo("https://www.google.com/doodles");
    }


    private void testFirstGoogleResult(String searchTerm, String expectedUrl) {
        RemoteWebDriver driver = d();
        driver.get("https://www.google.de");

        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.enterSearchTerm(searchTerm);
        googleSearchPage.search();


        GoogleListPage googleListPage = new GoogleListPage(driver);
        List<WebElement> links = googleListPage.getSearchResultLinks();

        assertThat(links).isNotEmpty();

        WebElement firstLink = links.get(0);
        assertThat(firstLink.getAttribute("href")).isEqualTo(expectedUrl);

        googleListPage.clickLink(firstLink);
        assertThat(driver.getCurrentUrl()).contains(expectedUrl);
    }

    @Test
    public void testSearchSpreadshirtJobs() throws Exception {

        RemoteWebDriver driver = d();
        driver.get("https://www.google.de");


        GoogleListPage googleListPage = new GoogleSearchPage(driver)
                .enterSearchTerm("spreadshirt jobs")
                .search();

        List<WebElement> links = googleListPage.getSearchResultLinks();

        assertThat(links).isNotEmpty();

        WebElement firstLink = links.get(0);
        assertThat(firstLink.getAttribute("href")).isEqualTo("https://www.spreadshirt.de/jobs-C1335");

        googleListPage.clickLink(firstLink);

        new SpreadshirtJobsPage(driver).clickLogo();

        new SpreadshirtIndexPage(driver);

        assertThat(driver.getCurrentUrl()).isEqualTo("https://www.spreadshirt.de/");
    }


}
