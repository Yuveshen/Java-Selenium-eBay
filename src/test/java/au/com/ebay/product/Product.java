package au.com.ebay.product;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Product {

	WebElement element;
	
	public Product(WebElement element) {
		this.element = element;
	}

	public String getTitle() {
		return element.findElement(By.className("product-title")).getText();	
	}
	
	public void clickAddToCart() {
		element.findElement(By.className("atcRedesignId_btn")).click();
	}
}

//TODO not needed at moment