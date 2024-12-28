
import BaseClasses.TestBase;
import Pages.AccessibilityPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class RunTests extends TestBase {
    @Test
    public void runTests(){
        HomePage homePage = new HomePage(driver);
        AccessibilityPage accessibilityPage =new AccessibilityPage(driver);
        homePage.clickAccessibility();
        accessibilityPage.clickCustomView();
        driver.navigate().back();
        driver.navigate().back();

    }
}
