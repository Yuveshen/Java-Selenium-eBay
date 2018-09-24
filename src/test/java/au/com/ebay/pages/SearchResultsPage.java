package au.com.ebay.pages;

import java.util.List;

import au.com.ebay.product.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public ProductPage selectFirstProduct(String search) throws Exception {

        List<WebElement> resultsList = driver.findElements(By.className("s-item"));
        for (WebElement result : resultsList) {
            Product product = new Product(result);
            if (product.getTitle().contains(search)) {
                product.selectProduct();
                return new ProductPage(driver);
            }
        }
        throw new Exception("Product not found");
    }

}
