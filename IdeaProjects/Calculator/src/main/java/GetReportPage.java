import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by RMTestServices on 23/02/17.
 */
public class GetReportPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public GetReportPage (WebDriver driver) {
        this.driver = driver;


    }
    public void GoToReportPage () {
        this.driver.findElement(By.id("viewReport")).click();
        String url = this.driver.getCurrentUrl();
        Assert.assertEquals("http://dev.tabofa.se/chronos/view/", url);

    }


}