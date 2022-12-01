package test_Scripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.AddToCart;
import pom_scripts.Login_TC_01;

public class AddToCart_TC extends Base_Test {
		
	@Test(dataProvider="testData", priority = 0 )
	public void TS_01(String [] testData) throws InterruptedException {
		Login_TC_01 login=new Login_TC_01(driver);
		login.enterValueInTF(testData[0]) ;
		
		login.enterValueInPswdTF(testData[1]);
		
		login.clickAction();
		Thread.sleep(2000);				
	}
	
	@Test( priority = 1)
		public	void TS_02() throws InterruptedException {
		AddToCart cart=new AddToCart(driver);
		cart.enterValueInTF("Grocery");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		//cart.select();
		//Thread.sleep(1000);
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@title,'Classic ')]"))).click();
		Thread.sleep(2000);
		Set<String> windowHandles=driver.getWindowHandles();
		 for(String handle:windowHandles) {
			 driver.switchTo().window(handle);
			 if(driver.getCurrentUrl().contains("horlicks"))
			 {
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
				Thread.sleep(2000);
				cart.Save();
				Thread.sleep(2000);
				cart.Remove();
				cart.Remove1();
				cart.Place();
			 }
		 }
	}
		
		
	

@DataProvider(name="testData")
public String[][] getTestData() throws IOException{
		String[][]testdata=ReadExcel.getMultipleData("Sheet1");
		return testdata;}
}
