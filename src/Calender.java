import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\MyWork\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");

		driver.findElement(By.xpath("//input[@id='travel_date']")).click();

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText()
				.contains("July 2021")) {

			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}

		List<WebElement> list = driver.findElements(By.className("day"));

		for (int i = 0; i < list.size(); i++) {

			String date = list.get(i).getText();

			if (date.equalsIgnoreCase("23")) {
				list.get(i).click();
				break;
			}

		}

	}

}
