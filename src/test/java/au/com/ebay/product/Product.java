package au.com.ebay.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Product {

    WebElement element;

    public Product(WebElement element) {

        this.element = element;
    }

    public String getTitle() {
        return element.findElement(By.className("s-item__title")).getText();
    }

    public void selectProduct() {
        element.findElement(By.className("s-item__title")).click();
    }
}

