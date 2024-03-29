package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement ddm;

    @FindBy(xpath = "//*[@id='twotabsearchtextbox']")
    public WebElement searchBox ;

    @FindBy(xpath = "(//img[@class='s-image'])[2]")
    public WebElement secondProduct ;


    //C02 data bilgileri locater

    @FindBy(xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisi ;

}
