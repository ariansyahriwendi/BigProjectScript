package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Punch extends BasePage{
    private By btnTime = new By.ByXPath("//*[@id='menu_time_viewTimeModule']/b");
    private By btnAttendance = new By.ByXPath("//*[@id='menu_attendance_Attendance']");
    private By btnPunchMenu = new By.ByXPath("//*[@id='menu_attendance_punchIn']");
    private By fieldNote = new By.ByXPath("//*[@id=\"note\"]");
    private By btnPunch = new By.ByXPath("//*[@id=\"btnPunch\"]");

    public Punch (WebDriver driver) { super(driver); }

    public void clickButtonTime() throws InterruptedException{
        clickButton(btnTime);
    }

    public void clickButtonAttendance() throws InterruptedException{
        clickButton(btnAttendance);
    }

    public void clickButtonPunchMenu() throws InterruptedException{
        clickButton(btnPunchMenu);
    }

    public void inputNote(String note) throws InterruptedException{
        inputText(fieldNote, note);
    }

    public void clickButtonPunch() throws InterruptedException{
        clickButton(btnPunch);
    }

}
