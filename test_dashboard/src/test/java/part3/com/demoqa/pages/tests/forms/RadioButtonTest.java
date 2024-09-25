package part3.com.demoqa.pages.tests.forms;


import org.testng.Assert;
import org.testng.annotations.Test;
import part3.com.demoqa.pages.base.BaseTest;

public class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioButton() {
        //object reference
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected = formsPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected,
                "\n Female Radio Button Is Not Selected \n");
    }
}
