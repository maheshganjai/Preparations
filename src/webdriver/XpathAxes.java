package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","F:\\OptumPre\\Drivers\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
       
        /* Basic locators in selenium */
       
        driver.findElement(By.id("email")).sendKeys("9704151742");  //Locator by ID
        
        driver.findElement(By.name("pass")).sendKeys("456985"); //Locator by name
      
       // driver.findElement(By.className("inputtext login_form_input_box")).click();   //Locator by className
        
        //driver.findElement(By.linkText("Forgotten account?")).click(); //Locator by linkText
        
        driver.findElement(By.partialLinkText("Forgotten")).click(); //Locator by partialLinkText
        
        driver.findElement(By.cssSelector("input#identify_email")).sendKeys("1234567");; //Locator by Css Selector
        
        //Navigating to guru99 bank url
        driver.navigate().to("http://demo.guru99.com/v1/");
        
        /* Advanced and most dynamic ways of finding xpaths axes */
        
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("12345"); //Basic xpath
        
       // driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click(); // By using contains() xpath
        
       // driver.findElement(By.xpath("//input[@type='submit' and @name='btnLogin']")).click(); //By using AND xpath
        
       // driver.findElement(By.xpath("//input[@type='submit' or @name='btnLogin']")).click(); //By using OR xpath
        
        driver.findElement(By.xpath("//*[starts-with(@name,'pass')]")).sendKeys(Keys.TAB); //By using starts-with xpath
        
        String text = driver.findElement(By.xpath("//span[text()='* mandatory field']")).getText(); //By using text() xpath
        System.out.println(text);
        
        driver.findElement(By.xpath("//*[@type='text']//following::input[1]")).sendKeys("123456"); //By using following xpath
        
        /* Navigating to Guru99.com url */
        driver.navigate().to("https://www.guru99.com/");
        
       // String ancestor=driver.findElement(By.xpath("//*[text()='Enterprise Testing']//ancestor::div[9]")).getText(); //By using ancestor xath
       // System.out.println(ancestor);
        
        driver.findElement(By.xpath("//*[@id='java_technologies']/child::li[4]")).click(); //By using child xpath
        
        //Navigating to guru99 bank url
        driver.navigate().to("http://demo.guru99.com/v1/");
        
        driver.findElement(By.xpath("//*[@type='submit']//preceding::input[1]")).sendKeys("hello"); //By using preceding xpath
        
        driver.findElement(By.xpath("//*[@type='submit']//following-sibling::input")).click(); //By using following-sibiling xpath
        
       // driver.findElement(By.xpath("//*[@id='rt-feature']//parent::div[1]")).click(); //By using parent xpath
        
        driver.findElement(By.xpath("//*[@type='password']//self::input")).click(); //By using self xpath
        
        driver.findElement(By.xpath("//*[@id='rt-feature']//descendant::a[1]")).click(); //By using descendant xpath
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
