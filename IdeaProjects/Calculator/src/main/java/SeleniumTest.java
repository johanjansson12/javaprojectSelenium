import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Created by RMTestServices on 22/02/17.
 */
public class SeleniumTest {
    private WebDriver driver;

    @Before
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver" , "/Users/RMTestServices/Desktop/chromedriver");
        this.driver = new ChromeDriver();
    }

    @After
    public void tearDown()
    {

       this.driver.quit();
    }

    @Test
    public void MyFirstTest() throws Exception
    {

        driver.get("http://www.google.se");
        driver.findElement(By.name("q")).sendKeys("Redmind");
        driver.findElement(By.name("q")).submit();
        String searchValue = driver.findElement(By.name("q")).getAttribute("value");
        Assert.assertEquals("Redmind", searchValue);

    }
    @Test
    public void MySecondTest() throws Exception
    {

        driver.get("http://dev.tabofa.se/");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("usr")).sendKeys("user2");
        driver.findElement(By.id("psw")).sendKeys("pass1234");
        driver.findElement(By.id("submit")).click();
        String userText= driver.findElement(By.id("profile")).getText();
        Assert.assertEquals("User 2", userText);

    }
    @Test
    public void MySecondTest2() throws Exception
    {

        driver.get("http://dev.tabofa.se/");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("usr")).sendKeys("user2");
        driver.findElement(By.id("psw")).sendKeys("pass1234");
        driver.findElement(By.id("submit")).click();
        String userText= driver.findElement(By.id("profile")).getText();
        Assert.assertEquals("User 2", userText);

    }
    @Test
    public void MySecondTest3() throws Exception
    {

        driver.get("http://dev.tabofa.se/");
        driver.findElement(By.id("login")).click();
        driver.findElement(By.id("usr")).sendKeys("user2");
        driver.findElement(By.id("psw")).sendKeys("pass1234");
        driver.findElement(By.id("submit")).click();
        String userText= driver.findElement(By.id("profile")).getText();
        Assert.assertEquals("User 2", userText);

    }
    @Test
    public void MySecondTest4() throws Exception
    {

        LandingPage landingPage = new LandingPage(this.driver);
        landingPage.navigateToGoogle();
        landingPage.writeToField("Redmind");
        landingPage.submitForm();
        ResultPage resultpage = new ResultPage(this.driver);
        resultpage.VerifyOnRightPlace();

    }
    @Test
    public void MySecondTest5() throws Exception
    {
        StartPage startpage = new StartPage(this.driver);
        startpage.GoToStart();
        startpage.ClickLogin();
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.UserInput();
        UserPage userpage = new UserPage(this.driver);
        userpage.VerifyUserIsLoggedIn();

    }
    @Test
    public void MySecondTest6() throws Exception
    {
        StartPage startpage = new StartPage(this.driver);
        startpage.GoToStart();
        startpage.ClickLogin();
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.VerifyBadUserInput();
        loginPage.UserInput();
        UserPage userpage = new UserPage(this.driver);
        userpage.VerifyUserIsLoggedIn();


    }
    @Test
    public void MySecondTest7() throws Exception
    {
        StartPage startpage = new StartPage(this.driver);
        startpage.GoToStart();
        startpage.ClickLogin();
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.UserInput();
        UserPage userpage = new UserPage(this.driver);
        userpage.VerifyUserIsLoggedIn();
        GetReportPage reportpage = new GetReportPage(this.driver);
        reportpage.GoToReportPage();

    }
    @Test
    public void MySecondTest8() throws Exception
    {
        StartPage startpage = new StartPage(this.driver);
        startpage.GoToStart();
        startpage.ClickLogin();
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.UserInput();
        TimeReportPage timeReportPage = new TimeReportPage(this.driver);
        timeReportPage.GoTimeReportPage();
        timeReportPage.UserReportTime();

    }
    @Test
    public void MySecondTest10() throws Exception
    {
        StartPage startpage = new StartPage(this.driver);
        startpage.GoToStart();
        startpage.ClickLogin();
        LoginPage loginPage = new LoginPage(this.driver);
        loginPage.UserInput();
        UserStartPage userStartPage = new UserStartPage(this.driver);
        userStartPage.Loggout();
        userStartPage.IsLoggedOut();

    }

    @Test
    public void MySecondTest9() throws Exception
    {
        ObjectPage objectPage = new ObjectPage(this.driver);
        objectPage.navigateToABTV();

    }

    @Test
    public void NavigateStartToTV() throws Exception
    {
        AftonbladetOne aftonbladetOne = new AftonbladetOne(this.driver);
        aftonbladetOne.GoToAftonbladetOne();
        aftonbladetOne.NavigateToTV();
        aftonbladetOne.VerifyTVSiteIsThere();
    }
    @Test
    public void DaDoucheMethod() throws Exception
    {
        AftonbladetOne aftonbladetOne = new AftonbladetOne(this.driver);
        aftonbladetOne.GoToAftonbladetOne();
        aftonbladetOne.NavigateToTV();
        aftonbladetOne.VerifyTVSiteIsThere();
    }





//    @Test
//    public void MySecondTest4() throws Exception
//    {
//        // this test should click and send mail
//
//        this.driver.get("http://dev.tabofa.se/");
//        this.driver.findElement(By.id("login")).click();
//        this.driver.findElement(By.linkText("here!")).click();
//        this.driver.findElement((By.id("account"))).sendKeys("johan.jansson@redmind.se");
//        this.driver.findElement(By.className(".//*[@type='submit']")).click();
//
//    }

}
