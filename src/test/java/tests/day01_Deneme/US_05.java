package tests.day01_Deneme;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_05 {

    @Test
    public void test02() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
        ReusableMethods.wait(1);

        BlueRentalPage blueRentalCarPage = new BlueRentalPage();
        Select ddm = new Select(blueRentalCarPage.select);
        ddm.selectByVisibleText(ConfigReader.getProperty("aracMarkasi"));

        blueRentalCarPage.pkLocation.sendKeys(ConfigReader.getProperty("pickUpLocation"));
        ReusableMethods.wait(1);
        blueRentalCarPage.pkLocation.sendKeys(ConfigReader.getProperty("pickUpLocation"));
        ReusableMethods.wait(1);
        blueRentalCarPage.drLocation.sendKeys(ConfigReader.getProperty("DropOffLocation"));
        ReusableMethods.wait(2);
        blueRentalCarPage.pkDate.sendKeys(ConfigReader.getProperty("pickUpDate"));//alis tarihi
        ReusableMethods.wait(1);
        blueRentalCarPage.pkTime.sendKeys(ConfigReader.getProperty("pickUpTime"));//alis saati
        ReusableMethods.wait(1);
        blueRentalCarPage.drDate.sendKeys(ConfigReader.getProperty("dropOffDate"));//geri veris tarihi
        ReusableMethods.wait(1);
        blueRentalCarPage.drTime.sendKeys(ConfigReader.getProperty("dropOffTime"));//geri veris saati
        ReusableMethods.wait(1);
        blueRentalCarPage.continueReserv.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(blueRentalCarPage.verifyson.isDisplayed());




    }
}
