package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Leave extends BasePage{
    private By btnLeave = new By.ByXPath("//*[@id=\"menu_leave_viewLeaveModule\"]/b");
    private By btnAssignLeave = new By.ByXPath("//*[@id=\"menu_leave_assignLeave\"]");
    private By fieldEmployee = new By.ByXPath("//*[@id=\"assignleave_txtEmployee_empName\"]");
    private By fieldDateFrom = new By.ByXPath("//*[@id=\"assignleave_txtFromDate\"]");
    private By fieldDateTo = new By.ByXPath("//*[@id=\"assignleave_txtToDate\"]");
    private By fieldComment = new By.ByXPath("//*[@id=\"assignleave_txtComment\"]");
    private By btnAssign = new By.ByXPath("//*[@id=\"assignBtn\"]");
    private By btnBody = new By.ByXPath("//*[@id=\"frmLeaveApply\"]/fieldset/ol");

    public Leave (WebDriver driver) { super(driver); }

    public void clickButtonLeave() throws InterruptedException{
        clickButton(btnLeave);
    }

    public void clickButtonAssignLeave() throws InterruptedException{
        clickButton(btnAssignLeave);
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

    public void inputFieldComment(String comment) throws InterruptedException {
        inputText(fieldComment, comment);
    }

    public void clickButtonAssign() throws InterruptedException {
        clickButton(btnAssign);
    }

    public void clickBody() throws InterruptedException {
        clickButton(btnBody);
    }

}

