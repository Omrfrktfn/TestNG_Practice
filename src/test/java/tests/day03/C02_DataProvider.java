package tests.day03;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.css.model.RuleUsage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HerOkuabPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_DataProvider {


    @DataProvider
    public static Object[][] negatifData() {
        return new Object[][]{{ConfigReader.getProperty("wrongEmail"),ConfigReader.getProperty("wrongPassword")},
                {ConfigReader.getProperty("wrongEmail1"),ConfigReader.getProperty("wrongPassword1")},
                {ConfigReader.getProperty("wrongEmail2"),ConfigReader.getProperty("wrongPassword2")}};
    }


    @Test(dataProvider = "negatifData")
    public void NegatifLogin(String email, String password) {

        HerOkuabPage heroku = new HerOkuabPage();

        // https://id.heroku.com/login sayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("herokuUrl"));
        ReusableMethods.wait(1);
        heroku.cerez.click();
        ReusableMethods.wait(1);

        // yanlıs email ve yanlıs password giriniz
        // (NOT: birden fazla yanlıs email ve password'u dataProvider kullanarak sırayla deneyin)
        heroku.email.sendKeys(email);
        ReusableMethods.wait(1);
        heroku.password.sendKeys(password);
        ReusableMethods.wait(1);

        // login butonuna tıklayınız
        heroku.login.click();
        ReusableMethods.wait(1);

        // "There was a problem with your login." yazisinin gorunur oldugunu test edin
        Assert.assertTrue(heroku.sonucYazisi.getText().contains("There was a problem with your login."));
        ReusableMethods.wait(1);

        // sayfayı kapatınız
        Driver.closeDriver();

    }
}
