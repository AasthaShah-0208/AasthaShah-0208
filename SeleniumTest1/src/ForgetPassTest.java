import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class ForgetPassTest {
    
    @Test
    public void forgetPassTest() throws InterruptedException{
        
    	System.out.println("Hello");
    	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_90\\chromedriver.exe");
    	
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
        driver.get("https://connect.sanitas-online.de/HealthCoach/");
        WebElement email, fplink, fpemail, btn_send;
        email = driver.findElement(By.id("ContentPlaceHolder1_ctl00_txtUserName"));
        email.click();
        email.sendKeys("ac501@yopmail.com");
        
        fplink = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ctl00_ForgotPasswordButton\"]/span"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", fplink);
        fplink.click();
        
        Thread.sleep(2000);
        fpemail = driver.findElement(By.id("ContentPlaceHolder1_ctl00_txtEmail"));
        fpemail.click();
        fpemail.sendKeys("ac501@yopmail.com");
        
        btn_send = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ctl00_btnEmail\"]/span"));
        btn_send.click();
        
    }
}
