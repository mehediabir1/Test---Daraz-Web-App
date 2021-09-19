package drz.com.Login;

import drz.com.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.w3c.dom.css.Counter;


public class Login_Drz extends Base {

    public static int Counter=0;

    public static void main(String[] args) {
        ChromeOpen();
        TC_DZ_LOGIN_001();
        TC_DZ_LOGIN_002();
        TC_DZ_LOGIN_003();
        TC_DZ_LOGIN_004();
        TC_DZ_LOGIN_005();
        TC_DZ_LOGIN_006();
        System.out.println("Testing Completed!");
        System.out.println("Total "+ Counter + " Bug Found");
        ChromeClose();
    }

    //Valid Data
    public static void TC_DZ_LOGIN_001() {

        GetUrl("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7kMyZYG&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");

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
                    System.out.println("TC_DZ_LOGIN_001 Failed, BUG found.");
                    Counter=Counter+1;
                }

    }

    //Invalid Data
    public static void TC_DZ_LOGIN_002() {

        GetUrl("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7kMyZYG&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");

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
                System.out.println("TC_DZ_LOGIN_002 Failed, BUG found.");
                driver.get("https://member.daraz.com.bd/user/logout?spm=a2a0e.home.header.17.735212f7iBiwMT");
                Counter=Counter+1;
                }
            else {
                System.out.println("TC_DZ_LOGIN_002 Passed");
            }

    }


    public static void TC_DZ_LOGIN_003() {

        GetUrl("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7kMyZYG&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");

        WebElement NumField = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
        NumField.click();
        NumField.sendKeys("01521326396");

        WebElement PassFld = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
        PassFld.click();
        PassFld.sendKeys("1234");

        WebElement loginBtn = findByClass("next-btn-primary");
        loginBtn.click();

        driver.navigate().refresh();

        boolean AccNm = findById("myAccountTrigger").isDisplayed();
        if (AccNm == true){
            System.out.println("TC_DZ_LOGIN_003 Failed, BUG found.");
            driver.get("https://member.daraz.com.bd/user/logout?spm=a2a0e.home.header.17.735212f7iBiwMT");
            Counter=Counter+1;
        }
        else {
            System.out.println("TC_DZ_LOGIN_003 Passed");
        }

    }

    public static void TC_DZ_LOGIN_004() {

        GetUrl("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7kMyZYG&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");

        WebElement NumField = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
        NumField.click();
        NumField.sendKeys("01a23123");

        WebElement PassFld = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
        PassFld.click();
        PassFld.sendKeys("1234");

        WebElement loginBtn = findByClass("next-btn-primary");
        loginBtn.click();

        driver.navigate().refresh();

        boolean AccNm = findById("myAccountTrigger").isDisplayed();
        if (AccNm == true){
            System.out.println("TC_DZ_LOGIN_004 Failed, BUG found.");
            driver.get("https://member.daraz.com.bd/user/logout?spm=a2a0e.home.header.17.735212f7iBiwMT");
            Counter=Counter+1;
        }
        else {
            System.out.println("TC_DZ_LOGIN_004 Passed");
        }

    }

    public static void TC_DZ_LOGIN_005() {

        GetUrl("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7kMyZYG&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");

        WebElement NumField = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
        NumField.click();
        NumField.sendKeys("01521326396ab");

        WebElement PassFld = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
        PassFld.click();
        PassFld.sendKeys("abir1100");

        WebElement loginBtn = findByClass("next-btn-primary");
        loginBtn.click();

        driver.navigate().refresh();

        boolean AccNm = findById("myAccountTrigger").isDisplayed();
        if (AccNm == true){
            System.out.println("TC_DZ_LOGIN_005 Failed, BUG found.");
            driver.get("https://member.daraz.com.bd/user/logout?spm=a2a0e.home.header.17.735212f7iBiwMT");
            Counter=Counter+1;
        }
        else {
            System.out.println("TC_DZ_LOGIN_005 Passed");
        }

    }

    public static void TC_DZ_LOGIN_006() {

        GetUrl("https://member.daraz.com.bd/user/login?spm=a2a0e.home.header.d5.735212f7kMyZYG&redirect=https%3A%2F%2Fwww.daraz.com.bd%2F");

        WebElement NumField = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
        NumField.click();
        NumField.sendKeys("ab01521326396");

        WebElement PassFld = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
        PassFld.click();
        PassFld.sendKeys("abir1100");

        WebElement loginBtn = findByClass("next-btn-primary");
        loginBtn.click();

        driver.navigate().refresh();

        boolean AccNm = findById("myAccountTrigger").isDisplayed();
        if (AccNm == true){
            System.out.println("TC_DZ_LOGIN_006 Failed, BUG found.");
            driver.get("https://member.daraz.com.bd/user/logout?spm=a2a0e.home.header.17.735212f7iBiwMT");
            Counter=Counter+1;
        }
        else {
            System.out.println("TC_DZ_LOGIN_006 Passed");
        }

    }

    }
