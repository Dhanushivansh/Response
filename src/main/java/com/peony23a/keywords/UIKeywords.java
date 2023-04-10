
package com.peony23a.keywords;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UIKeywords {
	public static RemoteWebDriver driver;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		System.out.println(browserName + "Browser Is Being launched Successfully");

	}

	public static void launchUrl(String url) {
		driver.get(url);
		System.out.println("url is launched Successfully" + url);
	}

	public static void closeBrowser() {
		driver.close();
		System.out.println("Browser Has Been closed successfully");

	}

	public static void enterText(By element, String Text) {
		driver.findElement(element).sendKeys(Text);
	}

	public static void hitButton(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keycode);
	}

	public static void releseButton(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(keycode);
	}

	public static List<String> getTexts(By element) {
		List<WebElement> elements = driver.findElements(element);
		List<String> texts = new ArrayList<String>();
		for (WebElement elmnt : elements) {
			texts.add(elmnt.getText());
		}
		return texts;
	}

	public static void CloseBrowse() {
		driver.close();
		System.out.println("hii dhananjay");
		System.out.println("Browser has been closed successfully");
	}
}