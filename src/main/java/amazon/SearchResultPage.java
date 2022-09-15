package amazon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage {

    private WebDriver driver;

    private static final Logger Log =  LogManager.getLogger(SearchResultPage.class);
    private By productImageSelector = By.cssSelector("img.s-image");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage openSearchResult(int index) {
        List<WebElement> resultatList = driver.findElements(productImageSelector);
        resultatList.get(index).click();
        return new ProductPage(driver);
    }
}