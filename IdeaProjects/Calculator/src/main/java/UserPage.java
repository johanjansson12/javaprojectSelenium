import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by RMTestServices on 23/02/17.
 */
public class UserPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public UserPage (WebDriver driver) {
        this.driver = driver;


    }
    public void VerifyUserIsLoggedIn () {
        String userText= this.driver.findElement(By.id("profile")).getText();
        Assert.assertEquals("User 2", userText);

    }



}