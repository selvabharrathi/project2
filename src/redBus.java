import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class redBus {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver","/Testyantra/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//input[@data-message='Please enter a source city']"));
		ele.sendKeys("Bangalore");
		ele.sendKeys(Keys.ENTER);
		WebElement ele1 =driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']"));
				ele1.sendKeys("Mumbai");
				ele1.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[.='Onward Date']")).click();
		/*boolean flag=true;
		while(flag)
		{*/
			driver.findElement(By.xpath("//button[.='>']")).click(); 
			driver.findElement(By.xpath("//td[.='Sept 2019']")).click();
			driver.findElement(By.xpath("//td[.='28']")).click();
			driver.findElement(By.id("search_btn")).submit();
		/*}*/
		
		
	}

}
