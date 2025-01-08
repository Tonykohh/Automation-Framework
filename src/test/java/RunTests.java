
import BaseClasses.TestBase;
import Pages.AccessibilityPage;
import Pages.HomePage;
import Pages.Textfields;
import Pages.ViewsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RunTests extends TestBase {
    HomePage homePage ;
    AccessibilityPage accessibilityPage;
    ViewsPage viewsPage;
    Textfields textFieldsPage;


    public void initializerHomePage (){
        homePage =  new HomePage(driver);
    }
    public void initializerAccessibilityPage(){
        accessibilityPage = new AccessibilityPage(driver);
    }
    public void initializerViewsPage (){
        viewsPage = new ViewsPage(driver);
    }
    public void initializerTextFieldsPage (){
        textFieldsPage= new Textfields(driver);
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
    @Test(priority = 4)
    public void  runFourthTest (){
        homePage.clickViews();
        ScrollToText("TextFields");
        initializerViewsPage();
        viewsPage.clickTextFields();
    }

    @Test (priority =5)
    public void runFifthTest (){
        initializerTextFieldsPage();
        textFieldsPage.enterFirstField("This is a test statement");
        textFieldsPage.getFirstFields();
        Assert.assertEquals("This is a test statement", textFieldsPage.getFirstFields(), "this works well!");
        textFieldsPage.enterPasswordField("Travislaflame-");
        textFieldsPage.enterThirdField("This is the time I'm finally alive");


    }
}
