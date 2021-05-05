import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class SanitasLogin {
    public String url = "https://connect.sanitas-online.de/HealthCoach/Default.aspx";
    
    @Test()
    public void SLogin() throws InterruptedException{
        
    	System.out.println("Hello");
    	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_90\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        driver.get(url);
        WebElement login;
        login = driver.findElement(By.id("ContentPlaceHolder1_ctl00_txtUserName"));
        //login = driver.findElement(By.xpath("//input[@name='login-email']"));
        login.click();
        //js.executeScript("arguments[0].scrollIntoView();", login);
        login.sendKeys("ac501@yopmail.com");
        Thread.sleep(1000);
        //WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        System.out.println("txt clicked");
        
        WebElement pass = driver.findElement(By.id("ContentPlaceHolder1_ctl00_txtPassword"));
        pass.sendKeys("Ilink@1234");
        Thread.sleep(1000);
        pass.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
     
    }
        
}
