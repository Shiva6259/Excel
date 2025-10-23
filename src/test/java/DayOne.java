import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DayOne {

	public static void main(String[] args) throws InterruptedException,IOException, WebDriverException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
				TakesScreenshot ts=(TakesScreenshot)driver;
				File src=ts.getScreenshotAs(OutputType.FILE);
				File des=new File("Screenshot New.png");
				FileHandler.copy(src, des);
				System.out.println("Captured");
				
				
			}
		
		
	}


