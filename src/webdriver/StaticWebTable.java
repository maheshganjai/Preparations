package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver","F:\\OptumPre\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("file:///C:/Users/kittu/Desktop/webtables/webtable.html");
	        
	        String columnValues=driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
	        System.out.println(columnValues);
	        
	        
	}

}
