import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String hrefvalue=link.getAttribute("href");
			if(hrefvalue==null || hrefvalue.isEmpty())
				System.out.println("Href is null or empty so cannot validate ");
			try {
				URL url=new URL(hrefvalue);
				HttpURLConnection con=(HttpURLConnection) url.openConnection();
				con.connect();
				if(con.getResponseCode()>=400) {
					System.out.println(hrefvalue+" Is broken url");
				}else {
					System.out.println(hrefvalue+" Is valid url");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		driver.quit();
	}

}
