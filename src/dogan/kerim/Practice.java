package dogan.kerim;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\MyWork\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		
		List<WebElement> firstList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> originalList = new ArrayList<String>();
		
		for(int i=0; i<firstList.size(); i++) {

			originalList.add(firstList.get(i).getText());
		}
		
		ArrayList<String> copiedList = new ArrayList<String>();
		
		for(int i=0; i<originalList.size(); i++) {
			
			copiedList.add(originalList.get(i));
			
			
		}
		
			Collections.sort(copiedList);
			
			Assert.assertTrue(originalList.equals(copiedList));
		

	}

}
