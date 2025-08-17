package com.telran.qa48;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

    WebDriver driver;
    //before method - setUp
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();

       // maximize browser to window
        driver.manage().window().maximize();

        driver.navigate().to("https://www.tel-ran.com/");
        //wait for all elements

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().refresh();

    }

    //test -
    @Test
    public void openGoogleTest(){
        System.out.println("Opened Google");
    }

    //after - tearDown
    @AfterMethod(enabled = true)
    public void tearDown(){

        driver.quit();
}

}
