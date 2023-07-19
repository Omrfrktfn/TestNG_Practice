package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FaceebookPage {

    public FaceebookPage() { //parametresiz constructor olusturduk

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//*[@class='_42ft _4jy0 _al65 _4jy3 _4jy1 selected _51sy']")
    public WebElement cerez;

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='pass']")
    public WebElement password;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement login;

    // baska sekilde tanımla yazı elementinin, gorunur oldugunu test edin
    @FindBy(xpath = "//*[@class='_9ay7']")
    public WebElement girdiginSifreYanlis;

}
