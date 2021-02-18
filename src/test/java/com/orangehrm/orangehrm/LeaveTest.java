package com.orangehrm.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Leave;
import com.sekolahqa.pages.Login;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class LeaveTest {
    WebDriver driver = Utils.getDriver();

    public LeaveTest() throws IOException {
    }

    // Leave Test
    @Test
    public void ProjectReport() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        Leave leave = new Leave(driver);

        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        leave.clickButtonLeave();
        leave.clickButtonLeave();
        leave.clickButtonAssignLeave();
        leave.inputTextFieldEmployee("Zahra test test");

        WebElement e = driver.findElement(By.xpath("//*[@id=\"assignleave_txtLeaveType\"]"));
        Select selectElement=new Select(e);
        selectElement.selectByVisibleText("Cuti");

        leave.clickFieldDateFrom();
        leave.inputFieldDateFrom("2021-03-01");
        leave.clickBody();
        leave.inputFieldComment("assign leave");
        leave.clickButtonAssign();
//        Utils.closeWebsite();

    }
}