package au.com.ebay.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public Boolean findProductInCart(String productTitle) {
        List<WebElement> cartList = driver.findElements(By.className("cart-bucket"));
        for (WebElement product : cartList) {
            if (product.findElement(By.className("item-title")).getText().contains(productTitle)) {
                return true;
            }
        }
        return false;
    }
}
