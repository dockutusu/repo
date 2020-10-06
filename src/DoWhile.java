import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoWhile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\MyWork\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		WebDriverWait w = new WebDriverWait(driver, 5);		
		
		driver.findElement(By.xpath("//a[contains(text(), 'get data via')]")).click();
		
		String text =w.until(ExpectedConditions.visibilityOfElementLocated(By.id("results"))).getText();
		
		System.out.println(text);
		


	}

}
