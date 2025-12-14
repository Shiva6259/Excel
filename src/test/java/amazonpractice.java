import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonpractice {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement target=driver.findElement(By.xpath("//select[@title=\"Search in\"]"));
//		Select dropdown=new Select(target);
//		dropdown.selectByVisibleText("Electronics");
//		driver.findElement(By.xpath("//input[@role=\"searchbox\"]")).sendKeys("mobile phones under 20000");
//		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
//		WebElement sortdropdownEle=driver.findElement(By.cssSelector("select[class*=a-native-dropdown]"));
//		Select sortdropdown=new Select(sortdropdownEle);
//		sortdropdown.selectByContainsVisibleText("Price: High to Low");
//		List<String> desiredBrands = Arrays.asList("Samsung", "realme", "Redmi");
//		List<WebElement> brands=driver.findElements(By.xpath("//div[@id=\"brandsRefinements\"]/ul//li/span/a"));
//		WebElement storage=driver.findElement(By.xpath("//ul[@id='filter-p_n_g-1003492455111']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click",storage);
//		
//		driver.findElement(By.xpath("//ul[@id='filter-p_n_g-1003469290111']//li")).click();
		
		//		for(WebElement brand:brands) {
//			if(brand.getText().equalsIgnoreCase("samsung")) {
//			String brandText=brand.getText().trim();
//			if(desiredBrands.contains(brandText))
//				brand.click();
//				Thread.sleep(5000);	
//		}
//		driver.findElement(By.xpath("(//div[@id=\"brandsRefinements\"]/div)[2]/a")).click();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement ele=driver.findElement(By.xpath("//input[@placeholder=\"Search Amazon.in\"]"));
	Actions a=new Actions(driver);
	a.doubleClick(ele).perform();
	}	
	}
