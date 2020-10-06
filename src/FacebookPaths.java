import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPaths {

	 public static void main(String[] args) {


	    }

	      public static boolean areEqualByThreeDecimalPlaces (double a, double b){

	            int a1 = (int)(a*1000);
	            int b1 = (int)(b*1000);

	            if (a1==b1){

	                System.out.println(a);
	                System.out.println(a1);
	                System.out.println(b);
	                System.out.println(b1);

	                System.out.println("equal numbers");

	                return true;
	            } else {
	                System.out.println(false);
	                return false;
	            }

	      }




}
