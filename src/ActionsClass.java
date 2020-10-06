import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\MyWork\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		WebElement limitedDriver = driver.findElement(By.id("gf-BIG"));

		// Sayfanin sadece alt kismi icin bir driver olusturmus olduk
		int size = limitedDriver.findElements(By.tagName("a")).size();
		System.out.println(size);

		WebElement column = limitedDriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		int lastSize = column.findElements(By.tagName("a")).size();

		String newTab = Keys.chord(Keys.CONTROL, Keys.ENTER); // tuslarin harekete gecisi

		for (int i = 1; i < lastSize; i++) {

			column.findElements(By.tagName("a")).get(i).sendKeys(newTab); // bu sekilde ayri pencere
			// de aciyor. Yoksa ilkine tiklayinca birsonraki stale element olarak gorunuyor.
		}

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}
}
