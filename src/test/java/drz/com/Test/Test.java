package drz.com.Test;

import drz.com.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test extends Base {
    public static void main(String[] args) {
        ChromeOpen();
        GetUrl("https://www.daraz.com.bd/");
        TryThis();
    }
    public static void TryThis(){
        findById("anonLogin").click();

    }
}
