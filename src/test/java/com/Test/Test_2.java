package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.library;

public class Test_2 extends BaseClass {

	@Test
	public void Test_001() {
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		library.custom_Sendkeys(login.getTxt_email(), "Test");
		library.custom_Sendkeys(login.getTxt_password(), "12345678");
		
		library.getScreenShotCapture();
		
		
		
	}
}
