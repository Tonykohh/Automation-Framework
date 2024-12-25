import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Setup {


  public static DesiredCapabilities caps = new DesiredCapabilities();
    public static AndroidDriver driver;

    public static void startServer (){
        AppiumServiceBuilder builder = new AppiumServiceBuilder();
        builder.withIPAddress("127.0.0.1")
                .usingPort(4722)
                .withArgument(GeneralServerFlag.LOG_LEVEL, "debug");
        AppiumDriverLocalService service = AppiumDriverLocalService.buildService(builder);
        service.start();
    }

   public static void capabilities (){

      caps.setCapability("platformName", "android");
      caps.setCapability("automationName", "UIAutomator2");
      caps.setCapability("deviceName","TECNO-KJ5");
      caps.setCapability("appPackage", "com.gluak.f24");
      caps.setCapability("appActivity", "com.gluak.f24.GluakLibs.ui.container.AppMenu");
      caps.setCapability("noReset", false);
   }

   public static void mainSetup () throws MalformedURLException {
      capabilities();
       try {
           driver = new AndroidDriver(new URL("http://127.0.0.7:4724/wd/hub"), caps);
           System.out.println("Session started successfully!");
       } catch (Exception e) {
           e.printStackTrace();
       }

   }

   public static void main(String[] args) throws MalformedURLException {
       startServer();
        mainSetup();
   }
}

