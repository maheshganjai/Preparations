package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipInnerText {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		    System.setProperty("webdriver.chrome.driver","F:\\OptumPre\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.get("http://demo.guru99.com/test/social-icon.html");
	        
	        WebElement toolTip=driver.findElement(By.xpath("//*[@class='facebook']"));
	        String innerText=toolTip.getAttribute("title");
	        System.out.println(innerText);
	}

}
