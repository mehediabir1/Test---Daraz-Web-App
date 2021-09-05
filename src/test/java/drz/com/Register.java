package drz.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Register extends Base{
    public static void main(String[] args) {
        ChromeOpen();
        GetUrl("https://member.daraz.com.bd/user/register");
        TC_DZ_SIGNUP_001();
    }
    public static void TC_DZ_SIGNUP_001(){
        WebElement NumField = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
        NumField.click();
        NumField.sendKeys("01675249699");

        WebElement PassFld = findByXpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[3]/input");
        PassFld.click();
        PassFld.sendKeys("A1bcdef");

//Selecting month
        findById("month").click();
        List<WebElement> MonList = driver.findElements(By.xpath("//ul[@class='next-menu-content']//li"));
        for (WebElement list1 : MonList) {
            String innerList1 = list1.getAttribute("innerHTML");
            System.out.println(innerList1);
            if (innerList1.contentEquals("April")) {
                list1.click();
                break;
            }
        }
//Selecting Date
        findById("day").click();
        List<WebElement>DateList = driver.findElements(By.xpath("//ul[@class='next-menu-content']//li"));
        for (WebElement list2 : DateList) {
            String innerList2 = list2.getAttribute("innerHTML");
            System.out.println(innerList2);
            if (innerList2.contentEquals("10")) {
                list2.click();
                break;
            }
        }
//        //Selecting Year
//        WebElement year= findById("year");
//        year.click();

//        List<WebElement>YrList = driver.findElements(By.xpath("//ul[@class='next-menu-content']//li"));
//        for (int i=0; i<YrList.size(); i++){
//            WebElement list3 = YrList.get(i);
//            String innerList3 = list3.getAttribute("innerHTML");
//            System.out.println(innerList3);
//            if (innerList3.contentEquals("2020")){
//                list3.click();
//                break;
//            }
//        }

//        WebElement slider_container = findByXpath("//*[@id=\"nc_2__scale_text\"]/span");
//        WebElement Slider = findByXpath("//*[@id=\"nc_2_n1z\"]");
//        Actions action = new Actions(driver);
//        action.dragAndDropBy(Slider,665,371).build().perform();





    }
}