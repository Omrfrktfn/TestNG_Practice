package tests.day02;

import net.bytebuddy.description.field.FieldList;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_PageClassKullanimi {


    @Test
    public void test01() throws IOException {

        // amazon sayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.wait(1);

        // dropdown'dan "Computers" optionunu secin
        AmazonPage amazon = new AmazonPage();
        Select select = new Select(amazon.ddm);
        select.selectByVisibleText("Computers");
        ReusableMethods.wait(1);

        // arama motoruna "Asus" yazıp aratın
        amazon.searchBox.sendKeys("Asus" + Keys.ENTER);
        ReusableMethods.wait(1);

        // ikinci urunun fotografını cekin

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYYMdHHmmss");
        String date1 = date.format(dtf);

        File file = new File("target/takeScreenshot/screenshot"+date1+".jpg");

        File gecici = amazon.secondProduct.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(gecici, file);

        ReusableMethods.wait(1);

        // ikinci urune tıklayın
        amazon.secondProduct.click();
        ReusableMethods.wait(1);

        // title'ının "ASUS" icerdigini test edin
        System.out.println("tittle : " + Driver.getDriver().getTitle());
        String tittle = Driver.getDriver().getTitle();
        Assert.assertTrue(tittle.contains("ASUS"));
        ReusableMethods.wait(1);

        // sayfayı kapatın
        Driver.closeDriver();


    }
}
