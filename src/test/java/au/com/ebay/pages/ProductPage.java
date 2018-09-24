package au.com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import au.com.ebay.dialogs.AddedToCartDialog;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public String getProductTitle() {
        return driver.findElement(By.id("itemTitle")).getText();
    }

    public AddedToCartDialog clickAddToCartBtn() {
        driver.findElement(By.id("atcRedesignId_btn")).click();
        return new AddedToCartDialog(driver);
    }
}
