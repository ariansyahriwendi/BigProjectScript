package com.orangehrm.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Login;
import com.sekolahqa.pages.Logout;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LogoutTest {
    WebDriver driver = Utils.getDriver();

    public LogoutTest() throws IOException {
    }

    // Logout
    @Test
    public void logout() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Logout logout = new Logout(driver);

        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        logout.clickButtonUser();
        logout.clickButtonLogout();
        Utils.closeWebsite();
    }

    @Test
    public void loginWithNewEmployee() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Logout logout = new Logout(driver);

        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        logout.clickButtonUser();
        logout.clickButtonLogout();
        login.inputEmail("ariansyah");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        Utils.closeWebsite();
    }

}
