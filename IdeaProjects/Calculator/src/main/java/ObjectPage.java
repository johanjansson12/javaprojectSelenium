import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by RMTestServices on 23/02/17.
 */
public class ObjectPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public ObjectPage (WebDriver driver) {
        this.driver = driver;


    }
    public void navigateToABTV(){
        this.driver.get("http://tv.aftonbladet.se/abtv/articles/211363");


}

}

