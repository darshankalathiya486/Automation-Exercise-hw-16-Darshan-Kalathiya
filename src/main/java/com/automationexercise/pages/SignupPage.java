package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement enterAccountInformationText;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Mr.']")
    WebElement mrTitle;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Mrs.']")
    WebElement mrsTitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordEnter;

    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement daySelect;

    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement monthSelect;

    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement yearSelect;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Sign up for our newsletter!']")
    WebElement signUForOurNewsletterCheckBox;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Receive special offers from our partners!']")
    WebElement receiveSpecialOffersFromOurPartnersCheckBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='first_name']")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='last_name']")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement companyNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='address2']")
    WebElement address2Field;

    @CacheLookup
    @FindBy(xpath = "//select[@id='country']")
    WebElement countrySelect;

    @CacheLookup
    @FindBy(xpath = "//input[@id='state']")
    WebElement stateField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement cityField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement zipcodeField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement mobileNumberField;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Create Account']")
    WebElement createAccountButton;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement emailAddressAlreadyExistText;







    public String verifyEnterAccountInformation(){
        return getTextFromElement(enterAccountInformationText);
    }

    public void selectTitleMr(){
        clickOnElement(mrTitle);
    }

    public void selectTitleMrs(){
        clickOnElement(mrsTitle);
    }

    public void selectDay(String Day){
        selectByValueFromDropDown(daySelect,Day);
    }

    public void selectMonth(String Month){
        selectByVisibleTextFromDropDown(monthSelect,Month);
    }

    public void selectYear(String Year){
        selectByValueFromDropDown(yearSelect,Year);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordEnter,password);
    }

    public void clickOnSignUForOurNewsletterCheckBox(){
        clickOnElement(signUForOurNewsletterCheckBox);
    }

    public void clickOnReceiveSpecialOffersFromOurPartnersCheckBox(){
        clickOnElement(receiveSpecialOffersFromOurPartnersCheckBox);
    }

    public void fillYourPersonalDetails(String firstname, String lastname, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber){
      sendTextToElement(firstNameField,firstname);
      sendTextToElement(lastNameField,lastname);
      sendTextToElement(companyNameField,company);
      sendTextToElement(addressField,address);
      sendTextToElement(address2Field,address2);
      selectByValueFromDropDown(countrySelect,country);
      sendTextToElement(stateField,state);
      sendTextToElement(cityField,city);
      sendTextToElement(zipcodeField,zipcode);
      sendTextToElement(mobileNumberField,mobileNumber);
    }

    public void clickOnCreateAccountButton(){
        clickOnElement(createAccountButton);
    }

    public String verifyTheEmailAddressAlreadyExistText(){
        return getTextFromElement(emailAddressAlreadyExistText);
    }

}
