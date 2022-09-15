package amazon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    private static final Logger Log =  LogManager.getLogger(CartPage.class);

    /**
     *
     * @param driver
     */

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getSubTotal() {
        return "1000";
    }
}