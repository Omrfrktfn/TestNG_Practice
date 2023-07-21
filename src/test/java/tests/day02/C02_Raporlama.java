package tests.day02;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_Raporlama extends TestBaseRapor {


    @Test
    public void testName() {

        extentTest=extentReports.createTest("TestNG","C02_Raporlama");
        //extentTest'e testname ve description degerlerini atamaliyiz

        // 'https://www.amazon.com' adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.wait(1);
        extentTest.info("amazon sayfasina gidildi");

        AmazonPage amazon = new AmazonPage();

        // arama kutusuna "Java" yazip aratın
        amazon.searchBox.sendKeys("Java" + Keys.ENTER);
        ReusableMethods.wait(1);
        extentTest.info("arama kutusuna java yazilip aratildi");

        // sonuc yazisinin "Java" icerdigini test edin
        Assert.assertTrue(amazon.sonucYazisi.getText().contains("Java"));
        ReusableMethods.wait(1);
        extentTest.pass("sonuc yazisinin java icerdigi test edildi");

        // kontrollu olarak yeni bir sayfa acın
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        ReusableMethods.wait(1);
        extentTest.info("yeni bir pencere acildi");

        // yeni acılan sayfada "Kitap" aratın
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.wait(1);
        extentTest.info("acilan yeni pencerede amazon sayfasina gidildi");

        amazon.searchBox.sendKeys("Kitap" + Keys.ENTER);
        ReusableMethods.wait(1);
        extentTest.info("arama kutusuan Kitap yazilip aratildi");

        // sonuc yazisinin Kitap icerdigini test edin
        Assert.assertTrue(amazon.sonucYazisi.getText().contains("Kitap"));
        ReusableMethods.wait(1);
        extentTest.pass("sonuc yazisinin Kitap icerdigi test edildi");

        // sayfayı kapatınız
        Driver.closeDriver();

        // test raporu alınız
        extentReports.flush();


    }
}
