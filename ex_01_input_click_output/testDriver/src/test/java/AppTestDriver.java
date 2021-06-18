/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author fabricio
 */
public class AppTestDriver {
    
    // System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
    // WebDriver driver = new ChromeDriver();
    // driver.get("http://localhost:8080/testing_tools_selenium_wd/");

    @Test
    public void testEvenNumber() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");    
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/app/");
        
        Thread.sleep(5000);
        WebElement numberInput = driver.findElement(By.name("number"));
        numberInput.sendKeys("3");
    
        Thread.sleep(5000);

        WebElement bt = driver.findElement(By.id("dataSender"));
        bt.click();

        Thread.sleep(5000);

        // ===VALIDANDO SE O NÚMERO É PAR========

        String isEvenStatus = driver.findElement(By.id("isEvenParagraph")).getText();
        assertTrue(isEvenStatus.equals("0"));
		driver.close();
        driver.quit();
    }
}


