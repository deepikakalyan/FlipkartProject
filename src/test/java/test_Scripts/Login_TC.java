package test_Scripts;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Login_TC_01;

public class Login_TC extends Base_Test {

	@Test(dataProvider="testData")
	public void TS_01(String [] testData) {
		Login_TC_01 login=new Login_TC_01(driver);
		login.enterValueInTF(testData[0]) ;
		
		login.enterValueInPswdTF(testData[1]);
		
		login.clickAction();
		
	}
	
	@DataProvider(name="testData")
public String[][] getTestData() throws IOException{
		String[][]testdata=ReadExcel.getMultipleData("Sheet1");
		return testdata;
		}
	}



	
	
	



