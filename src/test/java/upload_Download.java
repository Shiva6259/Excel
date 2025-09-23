import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class upload_Download {	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Shiva");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12340");
		driver.findElement(By.xpath("//input[@id='chkboxOne']")).click();
		driver.findElement(By.xpath("//input[@id='chkboxTwo']")).click();
		driver.findElement(By.cssSelector("button.submit.signInBtn")).click();
		String text=driver.findElement(By.cssSelector("p.error")).getText();
		Assert.assertEquals(text,"* Incorrect username or password");
		driver.findElement(By.cssSelector(".forgot-pwd-container")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement tagName=driver.findElement(By.tagName("h2"));
		wait.until(ExpectedConditions.visibilityOf(tagName));
		driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys("Shiva");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("123456");
		driver.findElement(By.cssSelector("input[placeholder=\'Phone Number\']")).sendKeys("1020304050");
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		WebElement ele=driver.findElement(By.cssSelector(".form-container h1"));
		wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Shiva");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		String final_text=driver.findElement(By.xpath("//div[@class='login-container']/p")).getText();
		Assert.assertEquals(final_text,"You are successfully logged in.");
		/*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
		WebElement locator=driver.findElement(By.xpath("(//input[@id=\"input1\"])[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\'input1\').value='Shiva';");
		WebElement locatora=driver.findElement(By.xpath("//*[text()=\" Checkbox 1\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(locatora).click().perform();
		driver.findElement(By.id("loadContent")).click();
		String text=driver.findElement(By.xpath("((//div[@class=\"widget-content\"]/table)[1]/tbody/tr)[5]")).getText();
		System.out.println(text);
		driver.findElement(By.id("comboBox")).click();
		*/
		
	}
}

