import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by RMTestServices on 23/02/17.
 */
public class AftonbladetOne {
    private WebDriver driver;
    private WebDriverWait wait;

    public AftonbladetOne (WebDriver driver) {
        this.driver = driver;


    }
    public void NavigateToTV() {
       driver.findElement(By.className("abTvIcon")).click();


    }
    public void GoToAftonbladetOne() {
    driver.navigate().to("http://www.aftonbladet.se/");
    String url = this.driver.getCurrentUrl();
    Assert.assertEquals("http://www.aftonbladet.se/", url);
    WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("abTvIcon")));



    }
    public void VerifyTVSiteIsThere() {
        Boolean isPresent = driver.findElements(By.className("desktop-container")).size() > 0 ;
        String url = this.driver.getCurrentUrl();
        Assert.assertEquals("http://tv.aftonbladet.se/abtv/", url);

    }
    public void VerifySearch() {
        driver.navigate().to("http://tv.aftonbladet.se/abtv/");
        String barcode="Zlatan";
        driver.findElement(By.xpath(".//[@id='header']/div/div[3]/div/form/input[1]")).sendKeys("25025");
        

    }


}

