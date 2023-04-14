package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class ParametersExample
{
    WebDriver driver;

    @BeforeClass
    @Parameters( {"browser","url"})
    void setupDriver(String browser, String link)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        else if(browser.equalsIgnoreCase("safari"))
        {
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }

        driver.get(link);
        driver.manage().window().maximize(); //Full screen.
    }
    @Test
    void getTitleFromHomePage() throws InterruptedException
    {

        driver.findElement(By.name("q")).sendKeys("Mobile");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(1000);

        Assert.assertEquals(driver.getTitle(),"Mobile - Google Search");
    }
    @AfterClass
    void closeDriver()
    {
        driver.close();
    }
}