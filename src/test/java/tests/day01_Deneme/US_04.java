package tests.day01_Deneme;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_04 {

    @Test
    public void test02() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        ReusableMethods.wait(1);

        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();
        ReusableMethods.wait(1);
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("missingEmail"), Keys.TAB,
                ConfigReader.getProperty("blueRentalPassword"), Keys.ENTER);
        ReusableMethods.wait(1);
        Assert.assertTrue(blueRentalPage.missingEmail.isDisplayed());

    }
}
