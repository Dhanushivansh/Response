package com.Peony23a;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.peonny23a.util.Envoirment;
import com.peonny23a.util.PropUtil;
import com.peony23a.Config.TestBase;
import com.peony23a.keywords.UIKeywords;
public class Producttests extends TestBase {
	@Test
	public void verifySearchResultForPoloMen() throws AWTException, IOException {
		PropUtil repo=new PropUtil();
		Envoirment env= new Envoirment();
		UIKeywords.launchUrl(env.getAppUrl());
		UIKeywords.enterText(By.cssSelector(repo.getLocater("search_products_textbox")),"Polo Men");
		UIKeywords.hitButton(KeyEvent.VK_ENTER);
		UIKeywords.releseButton(KeyEvent.VK_ENTER);
		List<String> productTitles=UIKeywords.getTexts(By.cssSelector(repo.getLocater("product_titles_text")));
		for (String productTitle : productTitles) {
        Assert.assertTrue(productTitle.contains("Polo"),"Product Title Doesn't Contains Polo:"+productTitles);
		
		}
		
	}
}
