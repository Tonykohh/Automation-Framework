package Pages;

import BaseClasses.PageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Textfields extends PageBase {

    public Textfields (AndroidDriver driver){
        super(driver);
    }

    @AndroidFindBy (xpath = "//android.widget.LinearLayout[1]/*/android.widget.EditText")
    private List <WebElement> inputField;

    @AndroidFindBy (id = "io.appium.android.apis:id/edit")
    private WebElement firstFields;

    @AndroidFindBy (id = "io.appium.android.apis:id/edit1")
    private WebElement password;

    @AndroidFindBy (id = "io.appium.android.apis:id/edit2")
    private WebElement thirdField;

    public String getFirstFields() {
        return firstFields.getText();
    }

    public String getPassword() {
        return password.getText();
    }

    public String getThirdField() {
        return thirdField.getText();
    }

    public void enterFirstField (String text){
        enterText(firstFields, text);
    }
    public void enterPasswordField (String text){
        enterText(password, text);
    }

    public void enterThirdField (String text){
        enterText(thirdField, text);
    }

}
