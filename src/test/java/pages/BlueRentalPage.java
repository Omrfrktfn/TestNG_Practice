package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class BlueRentalPage {


    public BlueRentalPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@role='button'])[1]" )
    public WebElement login;

    @FindBy(xpath ="//*[@name='email']")
    public WebElement email;

    @FindBy(xpath ="//*[@id='dropdown-basic-button']")
    public WebElement verify;

    @FindBy(xpath ="//*[@class='Toastify__toast-body']")
    public WebElement wrongVerify;


    @FindBy(xpath ="//*[@class='Toastify__toast-body']")
    public WebElement wrongVerify2;

    @FindBy(xpath ="(//*[@class='invalid-feedback'])[1]")
    public WebElement missingEmail;


    @FindBy(xpath ="//*[@class='mb-3 form-select form-select-lg']")
    public WebElement ddm;






}
