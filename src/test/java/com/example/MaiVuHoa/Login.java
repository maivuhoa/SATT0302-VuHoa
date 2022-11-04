package com.example.MaiVuHoa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import com.example.MaiVuHoa.HomePage;
public class Login {
  WebDriver driver;
  By userName=By.id("username");
  By passWord=By.id("password");
  By btnLogin=By.xpath("//input[@value='Login']");
  By btnLoginTab=By.xpath("//a[@href='/Account/Login.cshtml']");
    public Login(WebDriver driver){
        this.driver=driver;
    }
    public void setUserName(String strUserName){

        driver.findElement(userName).sendKeys(strUserName);

    }
    public void setPassword(String strPassword){

        driver.findElement(passWord).sendKeys(strPassword);

    }
    public void clickLogin(){
        driver.findElement(btnLogin).click();
    }
    public void clickLoginTab(){
        driver.findElement(btnLoginTab).click();
    }



    public void loginToRailWay(String strUserName,String strPassWord){
        this.clickLoginTab();
        this.setUserName(strUserName);
        this.setPassword(strPassWord);
        this.clickLogin();

    }
}
