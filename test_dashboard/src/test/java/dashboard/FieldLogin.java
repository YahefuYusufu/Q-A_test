package dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FieldLogin {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        Dimension mediumSize = new Dimension(1024, 768);
        driver.manage().window().setSize(mediumSize);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.get("https://github.com/");
    }

    @AfterClass
    public void tearDown() {
//        driver.quit();
    }

    @Test
    public void testLoggingIntoApplication() throws InterruptedException {
        Thread.sleep(2000);
        var username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");

        var password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        driver.findElement(By.tagName("button")).click();
        Thread.sleep(2000);
        String actualResult = driver.findElement(By.tagName("h6")).getText();
        String expectedText = "Dashboard";
        Assert.assertNotEquals(actualResult,expectedText);
    }
}
