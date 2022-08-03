import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {


		// TODO Auto-generated method stub
		public static void main(String[] args)  {
			// TODO Auto-generated method stub
	 System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().fullscreen();

	}

}
