import java.util.Arrays;
import java.util.Scanner;
public class InterviewPrep {
	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Desktop\\Selenium\\chromedriver\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	driver.get("https://demo.nopcommerce.com/");
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.get("https://demo.nopcommerce.com/");
//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("iphone 15 pro max");
//	System.out.println(driver.getWindowHandle());
	int[] arr= {6,7,1,5,0,3};//1 5 0 3 6 7
	for(int i=0;i<arr.length-1;i++) {
		int min_index=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[min_index]>arr[j])
				min_index=j;
		}
		int temp=arr[min_index];
		arr[min_index]=arr[i];
		arr[i]=temp;
//	for(int a:arr) {
//		System.out.print(a+" ");
//	}
//	System.out.println();
	}
	
	}
}