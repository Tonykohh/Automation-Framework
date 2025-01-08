package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ViewsPage extends PageBase {
    public ViewsPage(AndroidDriver driver){
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"TextFields\"]")
    private WebElement TextFields;

    public WebElement getTextFields() {
        return TextFields;
    }

    public void clickTextFields (){
        click(TextFields);
    }

}
