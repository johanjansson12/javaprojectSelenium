import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by RMTestServices on 23/02/17.
 */
public class StartPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public StartPage (WebDriver driver) {
        this.driver = driver;


    }
    public void GoToStart () {
       this.driver.get("http://dev.tabofa.se/");


    }
    public void ClickLogin () {
        this.driver.findElement(By.id("login")).click();

    }

}