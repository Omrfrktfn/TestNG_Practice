package tests.day01;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_Priority extends TestBase {


        // amazon isimli bir test methodu olusturunuz. Ve amazona gidiniz
        // bestbuy isimli bir test methodu olusturunuz. Ve bestbuy'a gidiniz
        // techproeducation isimli bir test methodu olusturunuz. Ve techproeducation'a gidiniz

        // once techproeducation, sonra amazon, sonra bestbuy test methodu calısacak sekilde sıralama yapınız


    @Test(priority = -2)
    public void amazon() {
        driver.get("https://www.amazon.com");

    }

    @Test
    public void bestbuy() {
        driver.get("https://www.bestbuy.com");

    }


    @Test(priority = -5)
    public void techproeducation() {
        driver.get("https://www.techproeducation.com");

    }

    /*
    TestNG test methodlarini isim sirasina gore calistirir. Eger isim siralamasinin disinda bir siralama ile
    calistirilmasini isterseniz o zaman test methodlarina priority tanimlayabiliriz.

    prioriyt kucukten buyuge dogru calisir. Eger bir test methoduna priority degeri atanmamissa default olarak
    prioriyt=0 olarak kabul edilir
     */


}
