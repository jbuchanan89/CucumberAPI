package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {


    @FindBy(id="welcome")
    public WebElement welcomeText;

    public DashboardPage(){
        PageFactory.initElements(driver, this);
    }
}
