package com.orangehrm.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Login;
import com.sekolahqa.pages.Punch;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import java.io.IOException;

public class PunchTest {
    WebDriver driver = Utils.getDriver();

    public PunchTest() throws IOException {
    }

    // Punch In
    @Test
    public void punchIn() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Punch punch = new Punch(driver);

        login.inputEmail("ariansyah");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        punch.clickButtonTime();
        punch.clickButtonAttendance();
        punch.clickButtonPunchMenu();
        punch.inputNote("Hello I am In");
        punch.clickButtonPunch();
        Utils.closeWebsite();
    }

    // Punch Out
    @Test
    public void punchOut() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Punch punch = new Punch(driver);

        login.inputEmail("ariansyah");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        punch.clickButtonTime();
        punch.clickButtonAttendance();
        punch.clickButtonPunchMenu();
        punch.inputNote("Hello I am Out");
        punch.clickButtonPunch();
        Utils.closeWebsite();
    }

}