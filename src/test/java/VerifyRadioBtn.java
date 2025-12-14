import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		WebElement ele=driver.findElement(By.xpath("//div[text()=\"round trip\"]"));
		ele.click();
		boolean value=ele.isSelected();
		if(value) {
			System.out.println("radio btn is selected");
		}else {
			System.out.println("no radio btn is selected");
			ele.click();
			System.out.println("radio btn is selected");
		}
	}

}
