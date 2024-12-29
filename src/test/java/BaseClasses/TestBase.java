package BaseClasses;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestBase {
    public static DesiredCapabilities caps = new DesiredCapabilities();
    public  AndroidDriver driver;

    public static void capabilities (){

        caps.setCapability("platformName", "android");
        caps.setCapability("automationName", "UIAutomator2");
        caps.setCapability("deviceName","TECNO-KJ5");
        caps.setCapability("appPackage", "io.appium.android.apis");
        caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
        caps.setCapability("noReset", false);
    }
    // before class -
    // after class -
    // before method -
    //after method -
    // BeforeSuite -
    // AfterSuite -

    @BeforeClass
    public  void mainSetup () throws MalformedURLException {
        capabilities();
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), caps);
            //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            System.out.println("Session started successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public  void ScrollToText (String text){



    }
}
