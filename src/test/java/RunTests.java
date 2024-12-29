
import BaseClasses.TestBase;
import Pages.AccessibilityPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class RunTests extends TestBase {
    HomePage homePage ;
    AccessibilityPage accessibilityPage;


    public void initializerHomePage (){
        homePage=  new HomePage(driver);
    }
    public void initializerAccessibilityPage(){
        accessibilityPage = new AccessibilityPage(driver);
    }
    @Test(priority = 1, description = "Validate User can click on accessibility")
    public void runTests(){
       initializerHomePage();
        homePage.clickAccessibility();

    }

    @Test(priority = 2, description = "validate user can click on custom view")
    public void runSecondTest (){
        initializerAccessibilityPage();
        accessibilityPage.clickCustomView();

    }
    @Test(priority = 3, description = "validate user can go back")
    public void runThirdTest (){

        driver.navigate().back();
        driver.navigate().back();
    }
}
