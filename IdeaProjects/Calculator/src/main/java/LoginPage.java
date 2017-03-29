import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by RMTestServices on 23/02/17.
 */
public class LoginPage {
    private WebDriver driver;
    private WebDriverWait wait;


    public LoginPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);


    }
    public void UserInput () {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("psw")));
        this.driver.findElement(By.id("usr")).sendKeys("user2");
        this.driver.findElement(By.id("psw")).sendKeys("pass1234");
        this.driver.findElement(By.id("submit")).click();

    }
    public void VerifyBadUserInput () {
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("psw")));
        this.driver.findElement(By.id("usr")).sendKeys("12456påölk");
        this.driver.findElement(By.id("psw")).sendKeys("678ijhy&/(");
        this.driver.findElement(By.id("submit")).click();
        String usermessage = this.driver.findElement(By.id("ingetRamverk")).getText();
        Assert.assertEquals("Login failed, please try again.", usermessage);
    }

}