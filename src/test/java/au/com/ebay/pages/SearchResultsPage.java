package au.com.ebay.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage{

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public ProductPage selectFirstProduct(String search) throws Exception {
		List<WebElement> resultsList = driver.findElements(By.className("s-item"));
		for (WebElement result : resultsList) {
			if (result.findElement(By.className("s-item__title")).getText().contains(search)) {
				result.findElement(By.className("s-item__title")).click();
				return new ProductPage(driver);
			}
		}
		throw new Exception("Product not found");			
	}
}
