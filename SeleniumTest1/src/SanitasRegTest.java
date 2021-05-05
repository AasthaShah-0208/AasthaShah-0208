
	//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


	public class SanitasRegTest {
				
	   @Test(priority = 2)
	    public void RegTest2() throws InterruptedException{
	        
	        System.out.println("Hello");
	        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32_90\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	        driver.get("https://connect.sanitas-online.de/HealthCoach/AcceptGDPR.aspx?q=1&f=WR&C=en-US");
	        Thread.sleep(1000);
	        WebElement gdpr, fname, sname, email, pass, cpass, cb_tou, cb_dp, btn_reg;
	        gdpr = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ctl00_btnAccept\"]/span"));
	        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", gdpr);
	        //gdpr = driver.findElement(By.linkText("javascript:__doPostBack('ctl00$ContentPlaceHolder1$ctl00$btnAccept','')"));
	        Thread.sleep(1000);
	        gdpr.click();    
	        
	        fname = driver.findElement(By.id("ContentPlaceHolder1_ctl00_txtFirstName"));
	        fname.sendKeys("Aastha");
	        
	        sname = driver.findElement(By.id("ContentPlaceHolder1_ctl00_txtLastName"));
	        sname.sendKeys("Shah");
	        
	        email = driver.findElement(By.id("ContentPlaceHolder1_ctl00_txtEmail"));
	        email.sendKeys("ac532@yopmail.com");
	        
	        pass = driver.findElement(By.id("ContentPlaceHolder1_ctl00_txtPassWord"));
	        pass.sendKeys("Ilink@1234");
	        
	        cpass = driver.findElement(By.id("ContentPlaceHolder1_ctl00_txtConfirmPassWord"));
	        cpass.sendKeys("Ilink@1234");
	        
	        cb_tou = driver.findElement(By.id("ContentPlaceHolder1_ctl00_chkAcceptService"));
	        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", cb_tou);
	        cb_tou.click();
	        
	        cb_dp = driver.findElement(By.id("ContentPlaceHolder1_ctl00_chkAcceptDataProtection"));
	        cb_dp.click();
	        
	        btn_reg = driver.findElement(By.id("//*[@id=\"ContentPlaceHolder1_ctl00_lnkRegister\"]/span"));
	        btn_reg.click();
	    }

	}
