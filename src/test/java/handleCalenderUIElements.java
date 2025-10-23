import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class handleCalenderUIElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String month="8";
		String date="12";
		String year="2027";
		String[] expected={month,date,year};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("div[class*='react-date-picker__inputGroup']")).click();
		driver.findElement(By.xpath("//button[@class=\"react-calendar__navigation__label\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"react-calendar__navigation__label\"]")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector("button[class*=\"react-calendar__tile\"]")).get(Integer.parseInt(month)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		List<WebElement> actualList=driver.findElements(By.cssSelector("input[class*='react-date-picker__inputGroup__input']"));
		for(int i=0;i<actualList.size();i++) {
			System.out.println(actualList.get(i).getAttribute("value"));
			Assert.assertEquals(actualList.get(i).getAttribute("value"),expected[i]);
		}
	}

}
