package part3.com.demoqa.pages.base;

import base.BasePage;
import demoqa.pages.HomePage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    Dimension mediumSize = new Dimension(1024, 768);
    protected BasePage basePage;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().setSize(mediumSize);
    }

    @BeforeMethod
    public void loadApplication() throws InterruptedException {
        String DEMOQA_URL = "https://demoqa.com/";
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterClass
    private void tearDown() {
        delay(3000);
        driver.quit();
        //next radio button
    }
}
