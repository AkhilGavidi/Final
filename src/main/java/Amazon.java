import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.in/");
 driver.manage().window().fullscreen();
 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Refrigerator");
 Thread.sleep(2000);
 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

 driver.findElement(By.xpath("//img[@alt='Samsung 192 L 2 Star Direct Cool Single Door Refrigerator (RR19A241BGS/NL, Grey Silver)']")).click();

}
}