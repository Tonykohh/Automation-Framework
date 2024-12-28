package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase {

    public HomePage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidBy(accessibility = "Access'ibility")
   private WebElement accessibility;


    public WebElement getAccessibility() {
        return accessibility;
    }


    public void clickAccessibility(){
        click(accessibility);
    }
}
