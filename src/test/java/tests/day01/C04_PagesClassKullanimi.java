package tests.day01;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FaceebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_PagesClassKullanimi {

        // facebook anasayfaya gidin
        // kullanıcı email kutusuna rastgele bir isim yazın
        // kullanıcı sifre kutusuna rastgele bir password yazın
        // giris yap butonuna tıklayın
        // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
        // sayfayı kaptın


    @Test
    public void test01() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        Thread.sleep(2000);

        FaceebookPage face = new FaceebookPage();
        face.cerez.click();
        Thread.sleep(1000);
        face.email.sendKeys("userName");
        Thread.sleep(1000);
        face.password.sendKeys("password");
        face.login.click();
        Thread.sleep(3000);
        Assert.assertTrue(face.girdiginSifreYanlis.isDisplayed());

    }
}
