package part01;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        Dimension smallSize = new Dimension(800, 600); // Example for small size
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

    }
}