package au.com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

	protected WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setSearchString(String search) {
		driver.findElement(By.id("gh-ac")).sendKeys(search);
	}

	public SearchResultsPage clickSearchButton() {
		driver.findElement(By.id("gh-btn")).click();
		return new SearchResultsPage(driver);
		
	}

	public int getCartCount() {
		return Integer.parseInt(driver.findElement(By.id("gh-cart-n")).getText());
	}
	
	public CartPage clickCartButton() {
		driver.findElement(By.id("gh-cart-i")).click();
		return new CartPage(driver);
		
	}

}
