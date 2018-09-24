package au.com.ebay.dialogs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import au.com.ebay.pages.ProductPage;

public class AddedToCartDialog {

    public WebDriver driver;
    private WebElement element;

    public AddedToCartDialog(WebDriver driver) {
        this.driver = driver;
        element = driver.findElement(By.className("atcOlay"));
    }

    public ProductPage clickCloseDialog() {
        element.findElement(By.className("clzBtn")).click();
        return new ProductPage(driver);
    }
}
