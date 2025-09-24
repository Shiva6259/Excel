import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class InterviewPrep {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://ui.vision/demo/webtest/frames/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement frames=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	driver.switchTo().frame(frames);
	driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hello frame_1");
	driver.switchTo().defaultContent();
	WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	driver.switchTo().frame(frame2);
	driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("hello frame_2");
	driver.switchTo().defaultContent();
	WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
	driver.switchTo().frame(frame3);
	driver.findElement(By.xpath("//form[@name='name3']//input")).sendKeys("hello frame_3");
	driver.switchTo().frame(0);
	WebElement button=driver.findElement(By.xpath("(//div[@class='nWQGrd zwllIb'])[1]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",button);
	}
}