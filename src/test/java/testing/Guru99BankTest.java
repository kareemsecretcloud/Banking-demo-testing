package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;


public class Guru99BankTest {
    private WebDriver driver;
    
    
    

    @BeforeClass
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    
    
    @Test
    
    public void logintest() throws InterruptedException {
    	
    	driver.get("http://www.demo.guru99.com/V4/");
    	Thread.sleep(200);
    	driver.findElement(By.name("uid")).sendKeys("mngr568360");
    	driver.findElement(By.name("password")).sendKeys("amYhYgu");
    	driver.findElement(By.name("btnLogin")).click();
    	
    	try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    	
    	
    	// Verify if manager's home page is displayed after login
       // WebElement homePageTitle = driver.findElement(By.xpath("//title[contains(text(),'Guru99 Bank Manager HomePage')]"));
      //  Assert.assertTrue(homePageTitle.isDisplayed(), "Manager's home page title is not displayed after login");
    }
    	
 
    
    @AfterClass
    public void teardown() {
        driver.quit();
    }
    


	
}
