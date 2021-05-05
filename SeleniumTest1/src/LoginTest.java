import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Hello");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_90\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Browser opened");
		driver.manage().window().maximize();
		
		driver.get("https://connect.beurer.com/healthmanager");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Window scrolled");
		
		WebElement login, pass, lgnbtn;
		login = driver.findElement(By.xpath("//input[@name='login-email']"));
		login.click();
		login.sendKeys("a1@yopmail.com");
		System.out.println("Email printed");

		pass = driver.findElement(By.xpath("//input[@name='login-password']"));
		pass.click();
		pass.sendKeys("Ilink@1234");
		
		lgnbtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		lgnbtn.click();
		
	}

}
