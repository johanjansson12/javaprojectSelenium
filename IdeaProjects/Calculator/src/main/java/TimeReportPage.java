import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * Created by RMTestServices on 23/02/17.
 */
public class TimeReportPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public TimeReportPage (WebDriver driver) {
        this.driver = driver;


    }
    public void UserReportTime () {
        Select select = new Select(driver.findElement(By.id("action")));
        select.selectByVisibleText("Going for Lunch");

    }
    public void GoTimeReportPage () {
        this.driver.findElement(By.id("logTime")).click();


    }


}