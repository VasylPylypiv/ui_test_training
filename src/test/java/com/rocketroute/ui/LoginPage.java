package com.rocketroute.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void login() {
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("d1661356@urhen.com");
        driver.findElement(By.id("passwd")).sendKeys("1qaz!QAZ");
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    }
}