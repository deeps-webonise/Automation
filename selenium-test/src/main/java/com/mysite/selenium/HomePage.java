package com.mysite.selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class HomePage {
    public static void main(String[] args) {



        try {

            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://www.tripadvisor.in");
            String winHandleBefore = driver.getWindowHandle();
            driver.findElement(By.id("rdoFlights")).click();

            WebElement source = driver.findElement(By.id("metaFlightFrom"));
            source.clear();
            source.sendKeys("pune");
            Thread.sleep(1000);
            source.sendKeys(Keys.ENTER);



            WebElement destination = driver.findElement(By.id("metaFlightTo"));
            destination.clear();
            destination.sendKeys("delhi");
            Thread.sleep(1000);
            destination.sendKeys(Keys.ENTER);


            driver.findElement(By.id("SUBMIT_FLIGHTS"));
            destination.sendKeys(Keys.ENTER);
            Thread.sleep(10000);
            driver.findElement(By.xpath("/html/body/span/div[2]")).click();

            driver.switchTo().window(winHandleBefore);

            Thread.sleep(1000);

            WebElement webElement=driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[4]/div[2]/div[2]/div[4]/div/div[2]/div[1]/div/div/div[1]/div[2]/a/div/span/span"));
            WebElement webElement1=driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[4]/div[2]/div[2]/div[4]/div/div[2]/div[1]/div/div/div[1]/div[1]/div[1]/div[1]/div/div[2]"));

            System.out.println("The Airline is " + webElement1.getText());
            System.out.println("The cost is " + webElement.getText());



            driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[4]/div[2]/div[2]/div[4]/div/div[2]/div[1]/div/div/div[1]/div[2]/a/div/span/span")).click();

            Thread.sleep(5000);





        }


        catch (NoSuchElementException ex){
            System.out.println(ex.getStackTrace());
        }
        catch (Exception ex){
            System.out.println(ex.getStackTrace());
        }

    }



}

