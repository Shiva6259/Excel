import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDownload {

	public static void main(String[] args) throws IOException {
		String fruitName="Apple";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/upload-download-test/index.html");
		driver.findElement(By.xpath("//*[text()=\"Download\"]")).click();
		WebElement upload=driver.findElement(By.id("fileinput"));
		upload.sendKeys("C:/Users/USER/Downloads/Download (10).xlsx");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		By toastLocator=By.cssSelector(".Toastify__toast-body div:nth-child(2)");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(toastLocator));
		String toastMsg=driver.findElement(toastLocator).getText();
		System.out.println(toastMsg);
		Assert.assertEquals("Updated Excel Data Successfully.", toastMsg);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(toastLocator));
		String priceColumn=driver.findElement(By.xpath("//div[text()='Price']")).getAttribute("data-column-id");
		String actual=driver.findElement(By.xpath("//div[text()='"+fruitName+"']/parent::div/parent::div/div[@id=\"cell-"+priceColumn+"-undefined\"]")).getText();
		Assert.assertEquals("345",actual);
		}
}
