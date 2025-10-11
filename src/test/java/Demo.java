import java.util.LinkedHashSet;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://amazon.in");
//		driver.findElement(By.id("nav-search-dropdown-card")).click();
//		WebElement ele=driver.findElement(By.cssSelector(".nav-progressive-attrubute"));
//		Select s=new Select(ele);
//		s.selectByValue("search-alias=fashion");
//		driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("T shirts for men");
//		List<WebElement> values=driver.findElements(By.cssSelector(".left-pane-results-container"));
//		for(WebElement value:values) {
//			if(value.getText().equalsIgnoreCase("gym t shirts for men workout")) {
//				value.click();
//			}
//		}
////		driver.quit();
//		
//		
		String input="aavvbbeee";
		String result="";
		int count=1;
		for(int i=0;i<input.length()-1;i++) {
			if(input.charAt(i)==input.charAt(i+1)) {
				count++;
			}else {
				result=result+input.charAt(i)+count;
				count=1;
			}
		}
		result=result+input.charAt(input.length()-1)+count;
		System.out.println(result);
	}

}
