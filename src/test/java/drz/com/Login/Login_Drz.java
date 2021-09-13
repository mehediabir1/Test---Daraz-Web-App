package drz.com.Login;

import drz.com.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login_Drz extends Base {
    public static void main(String[] args) {
        ChromeOpen();
        GetUrl("https://member.daraz.com.bd/user/login");
        TC_DZ_LOGIN_001();
    }

    public static void TC_DZ_LOGIN_001(){
        WebElement NumField = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
        NumField.click();
        NumField.sendKeys("01521326396");

        WebElement PassFld = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
        PassFld.click();
        PassFld.sendKeys("abir1100");

        WebElement loginBtn = findByClass("next-btn-primary");
        loginBtn.click();

//        WebElement MyAcc = driver.findElement(By.linkText("TRACK MY ORDER"));
//        MyAcc.click();

         WebElement MyAcc = findByXpath("//*[@id=\"myAccountTrigger\"]");
         MyAcc.click();

         findById("myAccountTrigger").click();

         WebElement CustomerC = findByXpath("//*[@id=\"topActionCustomCare\"]/span");
         CustomerC.click();

//        String Actual = driver.getTitle();
//        System.out.println("Title is :"+ Actual);

//        if (driver.findElement(By.xpath("//*[@id=\"myAccountTrigger\"]")).getSize()!=0){
//
//        }

    }
}
