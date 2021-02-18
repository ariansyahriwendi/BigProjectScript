package com.orangehrm.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Admin;
import com.sekolahqa.pages.Login;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class AdminTest {
    WebDriver driver = Utils.getDriver();

    public AdminTest() throws IOException {
    }

    // Add Employee
    @Test
    public void addEmployee() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Admin admin = new Admin(driver);

        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.inputEmployeeName("Muhammad Ariansyah Riwendi");
        admin.inputUsername("ariansyah9");
        admin.inputPassword("s3Kol4HQA!*");
        admin.inputConfirmPassword("s3Kol4HQA!*");
        admin.clickButtonSave();
        Utils.closeWebsite();
    }

    // Add Employee With Existing Username
    @Test
    public void addEmployeeWithExistingUsername() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Admin admin = new Admin(driver);

        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.inputEmployeeName("Muhammad Ariansyah Riwendi");
        admin.inputUsername("ariansyah9");
        admin.inputPassword("s3Kol4HQA!*");
        admin.inputConfirmPassword("s3Kol4HQA!*");
        admin.clickButtonSave();
        admin.errorMessageUsernameProblem();
        Utils.closeWebsite();
    }

    // Add Employee With Invalid Confirm Password
    @Test
    public void addEmployeeWithInvalidConfirmPassword() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Admin admin = new Admin(driver);

        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.inputEmployeeName("Muhammad Ariansyah Riwendi");
        admin.inputUsername("ariansyah11");
        admin.inputPassword("s3Kol4HQA!*");
        admin.inputConfirmPassword("invalidpassword");
        admin.clickButtonSave();
        admin.errorMessagePasswordDoNotMatch();
        Utils.closeWebsite();
    }

    // Add Employee With Blank Employee Field
    @Test
    public void addEmployeeWithBlankEmployeeField() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Admin admin = new Admin(driver);

        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.inputUsername("ariansyah12");
        admin.inputPassword("s3Kol4HQA!*");
        admin.inputConfirmPassword("s3Kol4HQA!*");
        admin.clickButtonSave();
        admin.errorMessageEmployeeDoesNotExist();
        Utils.closeWebsite();
    }

    // Add Employee With Blank Field
    @Test
    public void addEmployeeWithBlankField() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Admin admin = new Admin(driver);

        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.clickButtonSave();
        admin.errorMessageEmployeeDoesNotExist();
        admin.errorMessageUsernameProblem();
        admin.errorMessagePasswordRequired();
        Utils.closeWebsite();
    }

    // Cancel Add Employee
    @Test
    public void cancelAddEmployee() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Admin admin = new Admin(driver);

        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        admin.clickButtonAdmin();
        admin.clickButtonAddEmployee();
        admin.clickButtonCancel();
        admin.dashboardAdminEmployee();
        Utils.closeWebsite();
    }

}
