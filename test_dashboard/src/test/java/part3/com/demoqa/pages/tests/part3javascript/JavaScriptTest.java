package part3.com.demoqa.pages.tests.part3javascript;

import org.testng.annotations.Test;
import part3.com.demoqa.pages.base.BaseTest;

import static base.BasePage.delay;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollingToElement() {
        homePage.goToForms();
        delay(5000);
    }
}
