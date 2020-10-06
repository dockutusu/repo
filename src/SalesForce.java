import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\MyWork\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.id("username")).sendKeys("hello");
		//driver.findElement(By.name("pw")).sendKeys("kerim");
		//driver.findElement(By.cssSelector("#Login")).click();
		
		//String textBox = driver.findElement(By.cssSelector("div#error.loginError")).getText();
		//System.out.println(textBox);
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

}