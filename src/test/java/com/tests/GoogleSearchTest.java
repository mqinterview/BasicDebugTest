package com.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleSearchTest {
	WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
    	driver.get("https://www.google.com");

        WebElement searchBox = driver.findElement(By.id("q"));
        searchBox.sendKeys("web.webex.com");
        searchBox.submit();

        System.out.println("Title : " + driver.getTitle().toLowerCase());
        Assert.assertTrue(driver.getTitle().toLowerCase().contains("webex"),
            "Title does not contain 'webex'");
        
        
        Assert.assertTrue(driver.getTitle().contains("webex"), "Title does not contain 'webex'");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

}
