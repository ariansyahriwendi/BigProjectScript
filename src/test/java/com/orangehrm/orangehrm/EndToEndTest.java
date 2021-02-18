package com.orangehrm.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class EndToEndTest {
    WebDriver driver = Utils.getDriver();

    public EndToEndTest() throws IOException {
    }

    // End To End Test
    @Test
    public void loginWithValidUsernameAndValidPassword() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Logout logout = new Logout(driver);
        Admin admin = new Admin(driver);
        Punch punch = new Punch(driver);
        EmployeeReport report = new EmployeeReport(driver);
        ProjectReport report2 = new ProjectReport(driver);
        Leave leave = new Leave(driver);

        // Login
        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();

        // Add New Employee
        admin.clickButtonAddEmployee();
        admin.inputEmployeeName("Muhammad Ariansyah Riwendi");
        admin.inputUsername("ariansyah20");
        admin.inputPassword("s3Kol4HQA!*");
        admin.inputConfirmPassword("s3Kol4HQA!*");
        admin.clickButtonSave();

        // Logout
        logout.clickButtonUser();
        logout.clickButtonLogout();

        // Login With New Employee
        login.inputEmail("ariansyah");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();

        // Punch In
        punch.clickButtonTime();
        punch.clickButtonAttendance();
        punch.clickButtonPunchMenu();
        punch.inputNote("Hello I am In");
        punch.clickButtonPunch();

        // Employee Report
        report.clickButtonTime();
        report.clickButtonTime();
        report.clickButtonReport();
        report.clickButtonEmployeeReport();
        report.inputTextFieldEmployee("Muhammad Ariansyah Riwendi");

        WebElement e = driver.findElement(By.xpath("//*[@id=\"time_project_name\"]"));
        Select selectElement=new Select(e);
        selectElement.selectByVisibleText("Nestle - nina12");

        report.clickFieldDateFrom();
        report.inputFieldDateFrom("2000-01-01");
        report.clickFieldDateTo();
        report.inputFieldDateTo("2021-02-02");
        report.clickButtonView();

        // Project Report

        report.clickButtonTime();
        report.clickButtonReport();
        report2.clickButtonProjectReport();

        WebElement e2 = driver.findElement(By.xpath("//*[@id=\"time_project_name\"]"));
        Select selectElement2=new Select(e2);
        selectElement2.selectByVisibleText("Nestle - nina12");

        report.clickFieldDateFrom();
        report.inputFieldDateFrom("2000-01-01");
        report.clickFieldDateTo();
        report.inputFieldDateTo("2021-02-02");
        report.clickButtonView();

        // Leave
        leave.clickButtonLeave();
        leave.clickButtonLeave();
        leave.clickButtonAssignLeave();
        leave.inputTextFieldEmployee("Muhammad Ariansyah Riwendi");

        WebElement e3 = driver.findElement(By.xpath("//*[@id=\"assignleave_txtLeaveType\"]"));
        Select selectElement3=new Select(e3);
        selectElement3.selectByVisibleText("Cuti");

        leave.clickFieldDateFrom();
        leave.inputFieldDateFrom("2021-03-01");
        leave.clickBody();
        leave.inputFieldComment("assign leave");
        leave.clickButtonAssign();

        // Punch Out
        punch.clickButtonTime();
        punch.clickButtonAttendance();
        punch.clickButtonPunchMenu();
        punch.inputNote("Hello I am Out");
        punch.clickButtonPunch();

        // Logout
        logout.clickButtonUser();
        logout.clickButtonLogout();

        Utils.closeWebsite();
    }

}