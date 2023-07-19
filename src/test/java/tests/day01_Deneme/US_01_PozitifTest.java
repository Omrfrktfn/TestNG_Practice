package tests.day01_Deneme;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_01_PozitifTest {

    @Test
    public void test01() {

        // Acceptance Criteria:
        // Admin olarak, uygulamaya giriş yapabilmeliyim
        // https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        ReusableMethods.wait(1);

        // Admin email: jack@gmail.com
        // Admin password: 12345
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        ReusableMethods.wait(1);
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"), Keys.TAB,
                ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);
        ReusableMethods.wait(1);
        Assert.assertTrue(blueRentalPage.verify.getText().contains("Jack"));
        // Assert.assertTrue(blueRentalPage.verify.isDisplayed());


    }
}
