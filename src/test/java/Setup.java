import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Setup {


  public static DesiredCapabilities caps = new DesiredCapabilities();
    public static AndroidDriver driver;

   public static void capabilities (){

      caps.setCapability("platformName", "android");
      caps.setCapability("automationName", "UIAutomator2");
      caps.setCapability("deviceName","TECNO-KJ5");
      caps.setCapability("appPackage", "io.appium.android.apis");
      caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
      caps.setCapability("noReset", false);
   }

   public static void mainSetup () throws MalformedURLException {
      capabilities();
       try {
           driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), caps);
           System.out.println("Session started successfully!");
       } catch (Exception e) {
           e.printStackTrace();
       }

   }

   public static void ScrollToText (String text){

   }

   public static void performActions (){
       driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
       driver.findElement(AppiumBy.accessibilityId("Custom View")).click();
       driver.navigate().back();
       driver.navigate().back();
       driver.findElement(AppiumBy.accessibilityId("Views")).click();

   }
   public static void main(String[] args) throws MalformedURLException {
       mainSetup();
       performActions();
   }
}

