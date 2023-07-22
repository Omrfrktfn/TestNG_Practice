package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerOkuabPage {


    public HerOkuabPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
//*[text()='Tüm Tanımlama Bilgilerini Kabul Et']

    @FindBy(xpath = "//*[text()='Tüm Tanımlama Bilgilerini Kabul Et']")
    public WebElement cerez;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='commit']")
    public WebElement login;

    @FindBy(xpath = "//*[text()='There was a problem with your login.']")
    public WebElement sonucYazisi;

}
