package drz.com.MyAcc;

import drz.com.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.naming.Name;

public class MyAccEdit extends Base {
    public static void main(String[] args) {
        ChromeOpen();
        Login();
        TC_DZ_MYACC_001();
    }

    public static void Login(){
        GetUrl("https://member.daraz.com.bd/user/login");

        WebElement NumField = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
        NumField.click();
        NumField.sendKeys("01521326396");

        WebElement PassFld = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
        PassFld.click();
        PassFld.sendKeys("abir1100");

        WebElement loginBtn = findByClass("next-btn-primary");
        loginBtn.click();

        driver.navigate().refresh();
        GetUrl("https://member.daraz.com.bd/user/profile");
    }
    public static void TC_DZ_MYACC_001() {

        findByXpath("//a[@href='#/profile/edit']").click();
        WebElement NameFld = findByXpath("//*[@id=\"container\"]/div/div/div[1]/div[1]/div/div/input");
        String ActualName = findByXpath("//*[@id=\"container\"]/div/div/div[1]/div[1]/div/div/input").getAttribute("value");
        NameFld.click();
        findByClass("mod-input-close-icon").click();
        NameFld.sendKeys("114 1521");
        findByClass("next-btn-primary").click();
        System.out.println(ActualName);

          if (driver.getPageSource().contains(ActualName))
          {
              System.out.println("true");
          }
          else
          {
              System.out.println("false");
          }

    }
}
