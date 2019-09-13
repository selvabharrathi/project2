import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ubuy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","/Testyantra/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ubuy.co.in");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement ele=driver.findElement(By.xpath("//abbr[.='Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[.='Running Shoes']")).click();
//		driver.findElement(By.xpath("(//a[contains(.,'WNDR-13 Training')])[4]")).click();
	}

}
