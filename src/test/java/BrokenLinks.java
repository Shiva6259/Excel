import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
//		List<WebElement> links=driver.findElements(By.tagName("a"));
//		for(WebElement link:links) {
//			String hrefvalue=link.getAttribute("href");
//			if(hrefvalue==null || hrefvalue.isEmpty())
//				System.out.println("Href is null or empty so cannot validate ");
//			try {
//				URL url=new URL(hrefvalue);
//				HttpURLConnection con=(HttpURLConnection) url.openConnection();
//				con.connect();
//				if(con.getResponseCode()>=400) {
//					System.out.println(hrefvalue+" Is broken url");
//				}else {
//					System.out.println(hrefvalue+" Is valid url");
//				}
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		driver.quit();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(System.getProperty("user.dir")+"//reports//"+"index.png");
		FileUtils.copyFile(src, des);
		System.out.println("captured");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String hrefvalue=link.getAttribute("href");
			if(hrefvalue==null || hrefvalue.isEmpty()) {
				System.out.println("link is null or empty");
			}try {
				URL url=new URL(hrefvalue);
				HttpURLConnection con=(HttpURLConnection) url.openConnection();
				con.connect();
				if(con.getResponseCode()>=400) {
					System.out.println(hrefvalue+" is a invalid link");
				}else {
					System.out.println(hrefvalue+" is valid link");
				}
			}catch(Exception e) {
				
			}
		}
	}

}
