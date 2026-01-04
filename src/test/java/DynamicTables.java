import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTables {
	public String baseurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public WebDriver driver;
	@BeforeTest
public void setup() {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get(baseurl);
	
}
	//@Test
	public void enterDetails() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.findElement(By.cssSelector(".oxd-userdropdown-tab")).click();
		WebElement ele=driver.findElement(By.xpath("//ul[@role=\"menu\"]/li/a"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		driver.findElement(By.xpath("//ul[@role=\"menu\"]/li/a[contains(text(),\"Logout\")]")).click();
	}
	//@Test
	public void InvalidCredentials() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		System.out.println(driver.findElement(By.cssSelector(".oxd-alert-content-text")).isDisplayed());
	}
	@Test
	public void VerifyDetails() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		List<WebElement> links=driver.findElements(By.xpath("//ul[@class=\"oxd-main-menu\"]/li/a/span"));
		for(WebElement link:links) {
		System.out.println(link.getText());
			if(link.getText().equalsIgnoreCase("PIM")) {
		
				link.click();
				break;
			}
		}
		driver.findElement(By.xpath("//nav[@aria-label=\"Topbar Menu\"]/ul/li/a[contains(text(),\"Add Employee\")]")).click();
		
//		WebElement ele=driver.findElement(By.xpath("//h6[text()=\"Add Employee\"]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOf(ele));
		driver.findElement(By.cssSelector(".orangehrm-firstname")).sendKeys("abdcd");
		driver.findElement(By.cssSelector(".orangehrm-middlename")).sendKeys("efgh");
		driver.findElement(By.cssSelector(".orangehrm-lastname")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[text()=\" Save \"]")).click();
		WebElement ele=driver.findElement(By.xpath("//h6[text()=\"Personal Details\"]"));
		//wait.until(ExpectedConditions.visibilityOf(ele));
		Assert.assertTrue(ele.isDisplayed());
	}
	@AfterTest
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
