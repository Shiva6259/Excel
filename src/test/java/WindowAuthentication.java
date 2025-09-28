import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
public class WindowAuthentication {
public static void main(String[] args) throws InterruptedException, IOException {
	//https://www.linkedin.com/posts/activity-7371029613411590144-J8Cn?utm_source=social_share_send&utm_medium=member_desktop_web&rcm=ACoAAFs_XRQBNgdlWbhJwQgPj3i_ftTAuznhRNk
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--headless");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File des=new File("Screenshot New.png");
	FileHandler.copy(src, des);
	System.out.println("Captured");
	
}
}
