//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Milestone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://the-internet.herokuapp.com/");
		 Thread.sleep(2000);
		 System.out.println(driver.getTitle());
		 driver.manage().window().fullscreen();
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[25]/a")).click();
	Actions action = new Actions(driver);
		WebElement webdriver = driver.findElement(By.className("figure"));
		action.moveToElement(webdriver).build().perform();
		//webDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[6]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'checkboxes\']/input[2]")).click();
		driver.navigate().back();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[27]/a")).click();
        Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'content\']/div/div/div/input")).sendKeys("2222"); 
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[11]/a")).click();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[18]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'file-submit\']")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[41]/a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[31]/a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[33]/a")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[7]/a")).click();
	}

}
