package first;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {
	WebDriver wd ;
	WebElement we;
	private String path=System.getProperty("user.dir");

	public void pageurl()
	{
	System.setProperty("webdriver.chrome.driver",path + "//chromedriverpath//chromedriver.exe");
	wd=new ChromeDriver();
	String s="https://www.voyaah.com/#/";
	wd.manage().window().maximize();
	wd.get(s);
	wd.findElement(By.xpath("//p[@class='mr-5 loginCursor']")).click();
	System.out.println("login page");
	}
	public void loginpage()
	{
		
	
	wd.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("gopujyothirmai14@gmail.com");
    wd.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Jyothiraghu@2019");
    wd.findElement(By.xpath("//button[@class='text-white save-button-styles mt-2']")).click();
	
	}
	 public static void main( String[] args )
	{
		Launchbrowser j=new Launchbrowser();
		j.pageurl();
		j.loginpage();
		
	}
	
}

