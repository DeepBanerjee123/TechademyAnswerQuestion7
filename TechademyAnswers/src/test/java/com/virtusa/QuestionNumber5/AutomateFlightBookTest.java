package com.virtusa.QuestionNumber5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomateFlightBookTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
    	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rony Banerjee\\Documents\\workspace-spring-tool-suite-4-4.19.0.RELEASE\\TechademyAnswers\\src\\test\\java\\Resource\\geckodriver.exe"); 
    	driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
    }

    @Test
    public void flightSearchAutomation() throws InterruptedException {
        Thread.sleep(5000); 

        // Close any popup if present
        try {
            driver.findElement(By.cssSelector("span[data-cy='closeModal']")).click();
        } catch (Exception ignored) {
        }

        // Click on Flights tab
        driver.findElement(By.xpath("//li[@data-cy='menu_Flights']")).click();
        Thread.sleep(2000);

        // Select OneWay trip
        driver.findElement(By.xpath("//li[@data-cy='oneWayTrip']")).click();
        Thread.sleep(2000);

        // Enter FROM location
        driver.findElement(By.xpath("//label[@for='fromCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'New Delhi')]")).click();

        // Enter TO location
        driver.findElement(By.xpath("//label[@for='toCity']")).click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Mumbai");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//p[contains(text(),'Mumbai')]")).click();

        System.out.println("Flight search setup completed successfully.");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}