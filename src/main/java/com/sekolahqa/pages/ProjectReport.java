package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectReport extends BasePage{
    private By btnTime = new By.ByXPath("//*[@id='menu_time_viewTimeModule']/b");
    private By btnReport = new By.ByXPath("//*[@id=\"menu_time_Reports\"]");
    private By btnProjectReport = new By.ByXPath("//*[@id=\"menu_time_displayProjectReportCriteria\"]");
    private By fieldDateFrom = new By.ByXPath("//*[@id=\"project_date_range_from_date\"]");
    private By fieldDateTo = new By.ByXPath("//*[@id=\"project_date_range_to_date\"]");
    private By btnView = new By.ByXPath("//*[@id=\"viewbutton\"]");

    public ProjectReport (WebDriver driver) { super(driver); }

    public void clickButtonTime() throws InterruptedException{
        clickButton(btnTime);
    }

    public void clickButtonReport() throws InterruptedException{
        clickButton(btnReport);
    }

    public void clickButtonProjectReport() throws InterruptedException{
        clickButton(btnProjectReport);
    }

    public  void clickFieldDateFrom() throws InterruptedException {
        clickButton(fieldDateFrom);
    }

    public void inputFieldDateFrom(String from) throws InterruptedException {
        inputText(fieldDateFrom, from);
    }

    public  void clickFieldDateTo() throws InterruptedException {
        clickButton(fieldDateTo);
    }

    public void inputFieldDateTo(String to) throws InterruptedException {
        inputText(fieldDateTo, to);
    }

    public void clickButtonView() throws InterruptedException {
        clickButton(btnView);
    }

}

