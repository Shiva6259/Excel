import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datafromexcel {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.findElement(By.cssSelector("div[class*='react-date-picker__inputGroup']")).click();
		driver.findElement(By.cssSelector("button[class*='react-calendar__navigation__label']")).click();
		driver.findElement(By.cssSelector("button[class*='react-calendar__navigation__label']")).click();
		
	}
	
}