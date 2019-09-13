import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class testTwo 
{
	static
	{
		System.setProperty("webDriver.chrome.driver","./project2/chromedriver.exe" );
		
	}
@Test
public void openapp()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("java");;	
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
	
	
	
	List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	
	System.out.println("Auto Suggest List ::" + list.size());
	
	for(int i = 0 ;i< list.size();i++)
	{
		System.out.println(list.get(i).getText());
		
		if(list.get(i).getText().equals("javascript"))
		{
			list.get(i).click();
			break;
		}
	}
}
	
}
