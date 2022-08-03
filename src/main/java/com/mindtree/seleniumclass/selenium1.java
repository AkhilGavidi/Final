package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.moneycontrol.com/");
 System.out.println(driver.getTitle());
 driver.manage().window().fullscreen();
 //driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("KL Rahul");
 //Thread.sleep(2000);
driver.findElement(By.xpath("//a[@title='Personal Finance']")).click();
driver.findElement(By.xpath("//*[@id='mc_mainWrapper']/header/div[1]/div[3]/nav/div/ul/li[9]/a))")).click();
 
	}

}