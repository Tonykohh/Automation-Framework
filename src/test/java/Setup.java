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
      caps.setCapability("appPackage", "com.gluak.f24");
      caps.setCapability("appActivity", "com.gluak.f24.GluakLibs.ui.container.AppMenu");
      caps.setCapability("noReset", true);
   }

   public static void mainSetup () throws MalformedURLException {
      capabilities();
       try {
           driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
           System.out.println("Session started successfully!");
       } catch (Exception e) {
           e.printStackTrace();
       }

   }

   public static void main(String[] args) throws MalformedURLException {
       mainSetup();
   }
}

