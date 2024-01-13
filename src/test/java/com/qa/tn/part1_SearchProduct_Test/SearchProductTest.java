package com.qa.tn.part1_SearchProduct_Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.tn.part1_SearchProductPage.HomePage;
import com.qa.tn.part1_SearchProductPage.SearchProductPage;
import com.tn.qa.testBase.TestBase;

public class SearchProductTest extends TestBase {
public SearchProductTest() throws Exception {	}

public WebDriver driver;
public HomePage homepage;
public SearchProductPage searchproductpage;
	
	@BeforeMethod
	public void registerSetup() {
		
		driver=initalizeBrowserAndOpenApplication();
	
	}
	@Test()
	public void verifySearchWithValidProduct() {
		homepage= new HomePage(driver);
		searchproductpage= homepage.navigateToSearchPage();
		Assert.assertTrue(searchproductpage.verifyDisplayStatusOfValidProduct());
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
