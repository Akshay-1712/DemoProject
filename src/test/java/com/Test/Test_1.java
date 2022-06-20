package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;

public class Test_1 extends BaseClass {
	
	@Test
	public void Test_001() {
		
		LoginPom login = PageFactory.initElements(driver,LoginPom.class);
		login.getTxt_email().sendKeys("Rahul");
		login.getTxt_password().sendKeys("12345");
	}
	@Test
	public void Test_002() {
		
		LoginPom login = PageFactory.initElements(driver,LoginPom.class);
		login.getTxt_email().sendKeys("Rahul123");
		login.getTxt_password().sendKeys("12345");
		
	}
	

}


