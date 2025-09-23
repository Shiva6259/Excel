import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOne {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(5000);
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("selenium interview questions")) {
				option.click();
				System.out.println("Clicked on mentioned element.");
				break;
			}
		}
	}

}
