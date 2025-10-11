import java.io.IOException;
import java.util.ArrayList;

public class testsampleforexcel {

	public static void main(String[] args) throws IOException {
		ReadingdataFromExcel a=new ReadingdataFromExcel();
		ArrayList s=a.getData("Purchase");
		System.out.println(s.get(0));
		System.out.println(s.get(1));
		System.out.println(s.get(2));
		System.out.println(s.get(3));
	}

}
