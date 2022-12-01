package pom_scripts;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCart extends BasePage{
	
	public WebDriver getDriver() {
		return driver;
	}


		public AddToCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		@FindBy(xpath="//div/input[@title='Search for products, brands and more']")
		WebElement searchTF;
		public void enterValueInTF(String  product){
			enter_value(searchTF , product);
		}
		
		/*@FindBy(xpath="//button[@type='submit']")
		WebElement search_click;
		public void search_click() {
			clickAction(search_click);
		}*/
		
		/*@FindBy(className="s1Q9rs")
		WebElement select;
		public void select() throws InterruptedException {
			clickAction(select);
		}
		
		/*@FindBy(xpath="//button[text()='ADD TO CART']")
		WebElement Add;
		public void Add() throws InterruptedException {
			
			clickAction(Add);
		}*/
		@FindBy(xpath="//div[text()='Save for later']")
		WebElement Save;
		public void Save() {
			clickAction(Save);
		}
		
		@FindBy(xpath="//div[text()='Remove']")
		WebElement Remove;
		public void Remove() throws InterruptedException {
			Thread.sleep(2000);
			clickAction(Remove);
		}
		
		@FindBy(xpath="(//div[text()='Remove'])[1]")
		WebElement Remove1;
		public void Remove1() throws InterruptedException {
			Thread.sleep(2000);
			clickAction(Remove1);
		}
		
		@FindBy(xpath="//span[text()='Place Order']")
		WebElement Place;
		public void Place() {
			clickAction(Place);
		}
		
	}


