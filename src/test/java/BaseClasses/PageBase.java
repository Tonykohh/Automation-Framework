package BaseClasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
 AndroidDriver driver;

    public PageBase(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        this.driver=driver;
    }

    public void waitForElement (WebElement element, Integer seconds){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public void click(WebElement element){
       waitForElement(element, 20);
        element.click();
    }

    public void enterText (WebElement element, String text){
        waitForElement(element, 20);
        element.sendKeys(text);
    }


}
