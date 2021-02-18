package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeReport extends BasePage{
    private By btnTime = new By.ByXPath("//*[@id='menu_time_viewTimeModule']/b");
    private By btnReport = new By.ByXPath("//*[@id=\"menu_time_Reports\"]");
    private By btnEmployeeReport = new By.ByXPath("//*[@id=\"menu_time_displayEmployeeReportCriteria\"]");
    private By fieldEmployee = new By.ByXPath("//*[@id=\"employee_empName\"]");
    private By fieldDateFrom = new By.ByXPath("//*[@id=\"project_date_range_from_date\"]");
    private By fieldDateTo = new By.ByXPath("//*[@id=\"project_date_range_to_date\"]");
    private By btnView = new By.ByXPath("//*[@id=\"viewbutton\"]");

    public EmployeeReport (WebDriver driver) { super(driver); }

    public void clickButtonTime() throws InterruptedException{
        clickButton(btnTime);
    }

    public void clickButtonReport() throws InterruptedException{
        clickButton(btnReport);
    }

    public void clickButtonEmployeeReport() throws InterruptedException{
        clickButton(btnEmployeeReport);
    }

    public void inputTextFieldEmployee(String name) throws InterruptedException{
        inputText(fieldEmployee, name);
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

