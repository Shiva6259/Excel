import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceException {

	WebDriver driver;
	@BeforeMethod
	public void start() {
		WebDriverManager.chromedriver().setup();	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
@Test
	public void example() {
		
		String first="Redmi";String second="iQOO";
		driver.get("https://www.amazon.in/s?k=mobile+phone+under+20000&crid=2EF7VAXKB3GGG&sprefix=%2Caps%2C336&ref=nb_sb_ss_recent_1_0_recent");
		driver.findElement(By.xpath("//div[@id=\"topRefinements/0\"]//a[@aria-label=\"See more\"]")).click();
		WebElement target=driver.findElement(By.xpath("//div[@id=\"topRefinements/0\"]//li//a/span[contains(text(),\"Oneplus\")]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(target));
		//driver.findElement(By.xpath("//div[@id=\"topRefinements/0\"]//li//a/span[contains(text(),\"Oneplus\")]")).click();
		target.click();
		WebElement firstMobile=driver.findElement(By.xpath("//ul[@id='filter-p_123']/span//a//span[text()=\"Redmi\"]"));
	
		//wait.until(ExpectedConditions.elementToBeClickable(firstMobile)).click();
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(firstMobile))).click();
	//	driver.findElement(By.xpath("//ul[@id='filter-p_123']/span//a//span[text()="+first+"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Clear\"]")).click();
		//wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(secondMobile))).click();
		WebElement secondMobile=driver.findElement(By.xpath("//ul[@id='filter-p_123']/span//a//span[text()=\"OPPO\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(secondMobile)).click();
		//wait.until(ExpectedConditions.visibilityOf(secondMobile));
		//driver.findElement(By.xpath("//ul[@id='filter-p_123']/span//a//span[text()="+second+"]")).click();
	}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
