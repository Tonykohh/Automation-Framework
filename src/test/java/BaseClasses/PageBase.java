package BaseClasses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
 AndroidDriver driver;
    public PageBase(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),"PageBase");
        this.driver=driver;
    }



    public void click(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
       // wait.until(ExpectedCondition.)
        element.click();
    }


}
