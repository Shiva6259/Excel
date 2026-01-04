import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class amazonpractice {
	WebDriver driver;
	@BeforeTest
	public void initialiseDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void brandSelection() throws InterruptedException {
		
		WebElement target=driver.findElement(By.xpath("//select[@title=\"Search in\"]"));
		Select dropdown=new Select(target);
		dropdown.selectByVisibleText("Electronics");
		driver.findElement(By.xpath("//input[@role=\"searchbox\"]")).sendKeys("mobile phones under 20000");
		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		WebElement sortdropdownEle=driver.findElement(By.cssSelector("select[class*=a-native-dropdown]"));
		Select sortdropdown=new Select(sortdropdownEle);
		sortdropdown.selectByContainsVisibleText("Price: High to Low");
		List<String> desiredBrands = Arrays.asList("Samsung", "realme", "Redmi");
		//List<WebElement> brands=driver.findElements(By.xpath("//div[@id=\"brandsRefinements\"]/ul//li/span/a"));
		List<WebElement> elements=driver.findElements(By.xpath("//ul[@id=\"filter-p_36\"]//li//span//span"));
		driver.findElement(By.xpath("//*[contains(text(),\"Get It by Tomorrow\")]")).click();
		//driver.findElement(By.xpath("//*[contains(text(),\"Samsung\")]")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement seemore=driver.findElement(By.xpath("(//div[@id=\"brandsRefinements\"])//*[text()=\"See more\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(seemore));
		seemore.click();
		
		List<String> brandsToSelect=Arrays.asList("Samsung","Redmi","realme");
		for(String brand:brandsToSelect) {
			List<WebElement> brands=driver.findElements(By.xpath("//ul[@id=\"filter-p_123\"]//li//a"));
			for(WebElement b:brands) {
				if (b.getText().trim().equalsIgnoreCase(brand)) {
		            new WebDriverWait(driver, Duration.ofSeconds(10))
		                    .until(ExpectedConditions.elementToBeClickable(b))
		                    .click();
		            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.stalenessOf(b));
            break;
			}
		}
//		driver.quit();
//		driver.findElement(By.xpath("(//div[@id=\"brandsRefinements\"]/div)[2]/a")).click();
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.amazon.in/");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	WebElement ele=driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]"));
//	Actions a=new Actions(driver);
//	a.doubleClick(ele).perform();
//		for(String brand:brandsToSelect) {
//			List<WebElement> brands=driver.findElements(By.xpath("//ul[@id=\"filter-p_123\"]//li//a"));
//			for(WebElement b:brands) {
//				if (b.getText().trim().equalsIgnoreCase(brand)) {
//		            new WebDriverWait(driver, Duration.ofSeconds(10))
//		                    .until(ExpectedConditions.elementToBeClickable(b))
//		                    .click();
//		            new WebDriverWait(driver, Duration.ofSeconds(10))
//                    .until(ExpectedConditions.stalenessOf(b));
//            break;
//			}
//		}
	}
	
}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
