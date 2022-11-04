package forTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import com.example.MaiVuHoa.Login;
public class TestLogin {
    String driverPath = "D:\\chromedriver.exe";
    WebDriver driver;
    Login objLogin;
    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.railwayb2.somee.com/Page/HomePage.cshtml");
    }
   @Test public void testLoginSuccess(){

        objLogin =new Login(driver);
        objLogin.loginToRailWay("aa@gmail.com","12345678");
    }


}
