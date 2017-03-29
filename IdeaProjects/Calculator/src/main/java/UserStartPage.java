import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by RMTestServices on 23/02/17.
 */
public class UserStartPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public UserStartPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);


    }
    public void Loggout () {
        this.driver.findElement(By.id("logOut")).click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#logout-modal .glyphicon-thumbs-up")));
        this.driver.findElement(By.cssSelector("#logout-modal .glyphicon-thumbs-up")).click();
    }
    public void IsLoggedOut () {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login")));;
        String login = this.driver.findElement(By.id("login")).getText();
        Assert.assertEquals("Login", login);
    }

}