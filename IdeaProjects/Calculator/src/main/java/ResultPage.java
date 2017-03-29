import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by RMTestServices on 23/02/17.
 */
public class ResultPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public ResultPage (WebDriver driver) {
        this.driver = driver;


    }
    public void VerifyOnRightPlace () {
        String result = this.driver.findElement(By.name("q")).getAttribute("value");
        Assert.assertEquals("Redmind", result);
        driver.quit();

    }

}