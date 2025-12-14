import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowAuthentication {
public static void main(String[] args) throws InterruptedException, IOException {
	//https://www.linkedin.com/posts/activity-7371029613411590144-J8Cn?utm_source=social_share_send&utm_medium=member_desktop_web&rcm=ACoAAFs_XRQBNgdlWbhJwQgPj3i_ftTAuznhRNk
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
//	ChromeOptions opt=new ChromeOptions();
//	opt.addArguments("--headless");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.amazon.in/");
//	driver.findElement(By.xpath("//*[text()=\"Search Amazon.in\"]/following-sibling::input")).sendKeys("Iphone 15 pro max");
//	driver.findElement(By.cssSelector("input[value=\"Go\"]")).click();
//	driver.findElement(By.xpath("//*[contains(text(),\"Apple iPhone 15 (128 GB) - Black\")]")).click();
//	Set<String>windows =driver.getWindowHandles();
//	Iterator<String> it=windows.iterator();
//	String parent=it.next();
//	String child=it.next();
//	driver.switchTo().window(child);
//	System.out.println(driver.findElement(By.cssSelector("span[class*=\"priceToPay\"]")).getText());
//	driver.findElement(By.id("searchDropdownBox")).click();
//	List<WebElement> values=driver.findElements(By.xpath("(//select[@id=\"searchDropdownBox\"])/option"));
//	for(WebElement value:values) {
//		System.out.println(value.getText());
//	}
//	driver.quit();
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File des=new File(System.getProperty("user.dir")+"//screenshotstaken//"+"1.png");
	FileUtils.copyFile(src, des);
	System.out.println("captured");
	driver.quit();
	
}
}
