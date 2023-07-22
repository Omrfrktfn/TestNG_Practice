package tests.day03;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C01_DataProvider {


    @DataProvider
    public static Object[][] aranacaKelimeler() {
        return new Object[][]{{"Nutella"}
                ,{"Java"}
                ,{"cigdem"}
                ,{"Netherlands"}};
    }

    @Test(dataProvider = "aranacaKelimeler")
    public void test01(String arananKelime) {

        // amazon sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.wait(1);

        // Nutella, Java, cigdem ve Netherlands icin arama yapalım
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys(arananKelime, Keys.ENTER);
        ReusableMethods.wait(1);

        // sonucların aradıgımız kelime icerdigini test edelim
        Assert.assertTrue(amazonPage.sonucYazisi.getText().contains(arananKelime));

        // sayfayı kapatalım
        Driver.closeDriver();

    }
}
