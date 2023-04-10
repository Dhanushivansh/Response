package com.peony23a.Config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.peony23a.keywords.UIKeywords;

public class TestBase {
@BeforeMethod
public void setUp() throws Exception {
	UIKeywords.openBrowser("Chrome");
}
 @AfterMethod
public void tearDown() throws Exception {
	UIKeywords.closeBrowser();
}
}
	
	
	
	
	
	

