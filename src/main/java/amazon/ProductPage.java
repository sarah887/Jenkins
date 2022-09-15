package amazon;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    private WebDriver driver;
    private By addToCartButtonSelector = By.cssSelector("[aria-labelledby='submit.add-to-cart-announce']");
    private By refuseAppleCareButtonSelector = By.cssSelector("[aria-labelledby='attachSiNoCoverage-announce']");
    private By openCartSelector = By.cssSelector("#attach-sidesheet-view-cart-button");
    private static final Logger Log =  LogManager.getLogger(ProductPage.class);
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage addToCart() {

        Log.info("Ajouter un élément au panier");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement ajouterAuPanierButton = wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButtonSelector));
        ajouterAuPanierButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(refuseAppleCareButtonSelector));
        return this;
    }

    public ProductPage refuseAppleCare() {
        driver.findElement(refuseAppleCareButtonSelector).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(openCartSelector));
        return this;
    }

    public CartPage openCartPage() {
        driver.findElement(openCartSelector).click();
        return new CartPage(driver);
    }
}