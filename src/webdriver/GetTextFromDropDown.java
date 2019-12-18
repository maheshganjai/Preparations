package webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetTextFromDropDown {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\OptumPre\\Drivers\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    
		WebElement all = driver. findElement(By. xpath("//*[@name='birthday_day']"));
		Select select = new Select(all);

		
		/* To get all the values from dropdown list */
		List<WebElement> list = select.getOptions();
		for(WebElement text : list)
		{
			String allValues=text.getText();
			System.out.println(allValues);
		}
		
		/* To get selected first value from dropdown */
		WebElement firstSelectedValue=select.getFirstSelectedOption();
		String valueSelected=firstSelectedValue.getText();
		System.out.println("First value from selected dropdown= "+valueSelected);
	}

}
