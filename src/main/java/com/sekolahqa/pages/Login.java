package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login extends BasePage{
    private By fieldEmail = new By.ByXPath("//*[@id='txtUsername']");
    private By fieldPassword = new By.ByXPath("//*[@id='txtPassword']");
    private By btnLogin = new By.ByXPath("//*[@id='btnLogin']");
    private By errorMessage = new By.ByXPath("//*[@id='spanMessage']");

    public Login (WebDriver driver) { super(driver); }

    public void inputEmail(String email) throws InterruptedException {
        inputText(fieldEmail, email);
    }

    public void inputPassword(String password) throws InterruptedException{
        inputText(fieldPassword, password);
    }

    public void clickButtonLogin() throws InterruptedException{
        clickButton(btnLogin);
    }
    public void userSeeErrorMessage() throws InterruptedException {
        waitUntilElementIsVisible(errorMessage);
    }


}
