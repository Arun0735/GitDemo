import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create driver object . it is drive all object 
		//interface driver <webdriver>
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\balaji\\Documents\\chromedriver.exe");
		   
		WebDriver driver = new ChromeDriver();
		
		
		// syntex url'   http://username:Password@siteurl
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		
		
		//click on basic auth link button (<a href="/basic_auth">Basic Auth</a>)
		driver.findElement(By.linkText("Basic Auth")).click();
		
		
	}

}
