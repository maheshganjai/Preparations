package webdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
	    	System.setProperty("webdriver.chrome.driver","F:\\OptumPre\\Drivers\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.get("http://demo.guru99.com/test/social-icon.html");
	        
	        List<WebElement> list=driver.findElements(By.tagName("a"));
	        int listSize=list.size();
	        System.out.println("Size of links = "+listSize);
	        for (int i = 0; i < listSize; i++) 
	        {
				WebElement links=list.get(i);
				String urlValue=links.getAttribute("href");
				
				brokenLinks(urlValue);
			}
	}
	 public static void brokenLinks(String str) throws IOException
     {
     	try
     	{
     		URL url= new URL(str);
         	HttpURLConnection connect = (HttpURLConnection)url.openConnection();
         	connect.setConnectTimeout(2000);
         	connect.connect();
         	if (connect.getResponseCode()==200) 
         	{
         		System.out.println(str +" - " +connect.getResponseMessage() );
    		}
         	if(connect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
    		{
    			System.out.println(str +" - " +connect.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND );
    		}	
     	}
     	catch(MalformedURLException e)
     	{
     		System.out.println(e.getMessage());
     	}
     	
     }

}
