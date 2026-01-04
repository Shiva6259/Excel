import java.util.Arrays;

public class datafromexcel {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		driver.findElement(By.cssSelector("div[class*='react-date-picker__inputGroup']")).click();
//		driver.findElement(By.cssSelector("button[class*='react-calendar__navigation__label']")).click();
//		driver.findElement(By.cssSelector("button[class*='react-calendar__navigation__label']")).click();
		int[] arr= {1,0,2,0,3,0,4,0};
		int size=arr.length;int n=size-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]!=0) {
				arr[n]=arr[i];
				n--;
			}
		}
		while(n>=0) {
			arr[n]=0;
			n--;
		}
		System.out.println(Arrays.toString(arr));
	}
	
}