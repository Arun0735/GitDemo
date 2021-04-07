import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method stub

			//Create driver object . it is drive all object 
			//interface driver <webdriver>
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaji\\Documents\\chromedriver.exe");
			   
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://altoconvertpdftojpg.com/");
			
		//	Regular expression of css 
	   // [class*='g-btn--choose']  / regular expression for css
	
			driver.findElement(By.cssSelector("[class*='g-btn--choose']")).click();
			Thread.sleep(3000);
			
			Runtime.getRuntime().exec("C:\\Users\\balaji\\Downloads\\fileupload.exe");
			
			
		}

	}
