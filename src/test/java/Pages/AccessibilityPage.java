package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import org.openqa.selenium.WebElement;

public class AccessibilityPage extends PageBase {

    public AccessibilityPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidBy(accessibility = "Custom View")
    private WebElement customView;


    public WebElement getCustomView() {
        return customView;
    }

    public void clickCustomView(){
        click(customView);
    }


}
