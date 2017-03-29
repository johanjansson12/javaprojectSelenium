import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by RMTestServices on 23/02/17.
 */
public class LandingPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public LandingPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 10);

    }
    public void writeToField(String input) {
        wait.until(ExpectedConditions.visibilityOf(this.driver.findElement(By.name("q"))));
        this.driver.findElement(By.name("q")).sendKeys(input);
    }
    public void submitForm(){
        this.driver.findElement(By.name("q")).submit();
    }

    public void navigateToGoogle(){
        this.driver.get("http://www.google.se");
    }
}

