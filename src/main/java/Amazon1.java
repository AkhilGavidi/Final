import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.in/");
 System.out.println(driver.getTitle());
 driver.manage().window().fullscreen();
 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Refrigerator");
 driver.findElement(By.id("nav-search-submit-button")).click();
 driver.findElement(By.xpath("(//a[contains(@href,'/Samsung-Direct-Refrigerator-RR19A24')])[1]")).click();
 //driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
driver.findElement(By.xpath("(//span[@class='a-price-whole'])[4]"));

}
	
}
