import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;


public class MainTest {

    @Test
    public static void testXYZBank () {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
            driver.findElement(By.xpath("//button[contains(@ng-click,'customer')]")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
            driver.findElement(By.xpath("//option[@value='1']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            Assert.assertEquals(driver.findElement(By.cssSelector(".fontBig")).getText(),"Hermoine Granger" );
            driver.quit();
        }
    }


