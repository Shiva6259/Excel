import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RunAutomationScripts implements IRetryAnalyzer{
	private int count=0;
	private int max_count=5;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count<max_count) {
			count++;
			return true;
		}
		return false;
	}

}
