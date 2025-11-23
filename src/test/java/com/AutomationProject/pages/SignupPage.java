package com.AutomationProject.pages;

import Pages.BasePage;
import driver.DriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {

    // *************** CONSTRUCTOR ***************
    public SignupPage() {
        super(DriverFactory.getDriver());
    }

    // *************** PAGEFACTORY LOCATORS ***************

    @FindBy(id = "signin2")
    private WebElement SignUp;
    
    @FindBy(id = "signInModalLabel")
    private WebElement signUpModalTitle;

    @FindBy(id = "sign-username")
    private WebElement usernameInput;

    @FindBy(id = "sign-password")
    private WebElement passwordInput;

    @FindBy(id = "errors")
    private WebElement errorLabel;

    @FindBy(css = "button.btn.btn-secondary[data-dismiss='modal']")
    private WebElement closeButton;

    // Button: <button type="button" onclick="register()" class="btn btn-primary">Sign up</button>
    @FindBy(xpath = "//button[@onclick='register()']")
    private WebElement signUpButton;

    // *************** ACTION METHODS ***************

    public String getModalTitle() {
        return getElementText(signUpModalTitle);
    }

    public void enterUsername(String username) {
        type(usernameInput, username);
    }

    public void enterPassword(String password) {
        type(passwordInput, password);
    }

    public void clickSignUp() {
        click(signUpButton);
    }

    public void closeModal() {
        click(closeButton);
    }
    
    public void clickSignUpHomepage() {
        click(SignUp);
    }

    public String getErrorMessage() {
        return getElementText(errorLabel);
    }
}
