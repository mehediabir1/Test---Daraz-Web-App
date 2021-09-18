package drz.com.Login;

import drz.com.Base;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Login_Drz extends Base {
    public static void main(String[] args) {
        ChromeOpen();
        GetUrl("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7kMyZYG&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");
        TC_DZ_LOGIN_001();
        GetUrl("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7kMyZYG&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");
        TC_DZ_LOGIN_002();
    }
    //Valid Data

    public static void TC_DZ_LOGIN_001() {

        WebElement NumField = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
        NumField.click();
        NumField.sendKeys("01521326396");

        WebElement PassFld = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
        PassFld.click();
        PassFld.sendKeys("abir1100");

        WebElement loginBtn = findByClass("next-btn-primary");
        loginBtn.click();

        driver.navigate().refresh();

        boolean AccNm = findById("myAccountTrigger").isDisplayed();
             if (AccNm == true){
                 System.out.println("TC_DZ_LOGIN_001 Passed");
                 driver.get("https://member.daraz.com.bd/user/logout?spm=a2a0e.home.header.17.735212f7iBiwMT");
                }
             else {
                    System.out.println("TC_DZ_LOGIN_001 Failed");
                }

        }
    public static void TC_DZ_LOGIN_002() {

        WebElement NumField = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
        NumField.click();
        NumField.sendKeys("00012345");

        WebElement PassFld = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
        PassFld.click();
        PassFld.sendKeys("abir1100");

        WebElement loginBtn = findByClass("next-btn-primary");
        loginBtn.click();

        driver.navigate().refresh();

        boolean AccNm = findById("myAccountTrigger").isDisplayed();
        if (AccNm == true){
            System.out.println("TC_DZ_LOGIN_002 Failed");
            driver.get("https://member.daraz.com.bd/user/logout?spm=a2a0e.home.header.17.735212f7iBiwMT");
        }
        else {
            System.out.println("TC_DZ_LOGIN_002 Passed");
        }

    }


    }
