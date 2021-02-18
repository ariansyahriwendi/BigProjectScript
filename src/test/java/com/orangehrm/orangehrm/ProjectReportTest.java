package com.orangehrm.orangehrm;

import com.sekolahqa.config.Utils;
import com.sekolahqa.pages.Login;
import com.sekolahqa.pages.ProjectReport;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class ProjectReportTest {
    WebDriver driver = Utils.getDriver();

    public ProjectReportTest() throws IOException {
    }

    // Project Report
    @Test
    public void ProjectReport() throws InterruptedException, IOException {
        Utils.openWebsite(Utils.getUrl());
        Utils.maximizeWebsite();
        Login login = new Login(driver);
        ProjectReport report = new ProjectReport(driver);

        login.inputEmail("Admin");
        login.inputPassword("s3Kol4HQA!*");
        login.clickButtonLogin();
        report.clickButtonTime();
        report.clickButtonReport();
        report.clickButtonProjectReport();

        WebElement e = driver.findElement(By.xpath("//*[@id=\"time_project_name\"]"));
        Select selectElement=new Select(e);
        selectElement.selectByVisibleText("Nestle - nina12");

        report.clickFieldDateFrom();
        report.inputFieldDateFrom("2000-01-01");
        report.clickFieldDateTo();
        report.inputFieldDateTo("2021-02-02");
        report.clickButtonView();
//        Utils.closeWebsite();


    }

}