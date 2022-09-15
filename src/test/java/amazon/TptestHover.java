package amazon;

import commun.SetupTeardown;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TptestHover extends SetupTeardown {

    @Test
    public void test2() {
        HomePage homePage = new HomePage(driver);

        WebElement loginButton = driver.findElement(By.cssSelector("#nav-link-accountList"));

        Actions actions = new Actions(driver);
        actions.moveToElement(loginButton);
        actions.perform();  // third test

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


}
