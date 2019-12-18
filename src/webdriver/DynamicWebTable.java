package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver","F:\\OptumPre\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.get("https://ui.freecrm.com/");
			
			driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[1]/div/input")).sendKeys("kittu.mis647@gmail.com");
			driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[2]/div/input")).sendKeys("Akshay@647");
			driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
			//Clicking on Contacts tab
			driver.findElement(By.xpath("//*[@id='main-nav']/a[3]")).click();
			
			//WebTable rows locators
			//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]
			//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2]
			//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]
			//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]
			//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[5]/td[2]
			//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[6]/td[2]
		
			String before_xpath = "//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
			String after_xpath = "]/td[2]";
			
			for (int i = 1; i <= 6; i++) 
			{
				String values=driver.findElement(By.xpath(before_xpath+ i +after_xpath)).getText();
				System.out.println(values);
				if(values.contains("Steve Waugh"))
				{
					driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+i+"]/td[2]")).click();
				}
			}
	        
	        
	}

}
