package com.virtusa.QuestionNumber3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.WebElement;

public class VerifyMakeMyTripLogo {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rony Banerjee\\Documents\\workspace-spring-tool-suite-4-4.19.0.RELEASE\\TechademyAnswers\\src\\test\\java\\Resource\\geckodriver.exe"); 

        WebDriver driver = new FirefoxDriver();

        try {
           
            driver.get("https://www.makemytrip.com/");

            
            WebElement logo = driver.findElement(By.cssSelector("img[alt='Make My Trip']"));


            
            if (logo.isDisplayed()) {
                System.out.println("MakeMyTrip logo is present on the page.");
            } else {
                System.out.println("MakeMyTrip logo is NOT present on the page.");
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            
            driver.quit();
        }
    }
}
