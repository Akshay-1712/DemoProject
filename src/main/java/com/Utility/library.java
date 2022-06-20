package com.Utility;

import org.openqa.selenium.WebElement;

public class library {
	
		
		public static void custom_Sendkeys(WebElement element,String value) {
			
			try {
				element.sendKeys(value);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

		public static void getScreenShotCapture() {
			//code of SS
		}
	}

