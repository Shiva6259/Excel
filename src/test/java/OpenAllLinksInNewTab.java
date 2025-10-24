import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class OpenAllLinksInNewTab {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.geeksforgeeks.org/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	WebElement footerdriver=driver.findElement(By.cssSelector("div[class=\"footer-container\"]"));
	System.out.print(footerdriver.findElements(By.tagName("a")).size());
	for(int i=0;i<footerdriver.findElements(By.tagName("a")).size();i++) {
		String tabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
		footerdriver.findElements(By.tagName("a")).get(i).sendKeys(tabs);
		Thread.sleep(5000);
	}
	Set<String> abc=driver.getWindowHandles();
	Iterator<String> it=abc.iterator();
	while(it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	}

}
