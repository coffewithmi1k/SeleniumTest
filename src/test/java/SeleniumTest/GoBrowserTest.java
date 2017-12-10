package SeleniumTest;

import PageObjects.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoBrowserTest {


    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "E:/Automation/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }

    @After
    public void tearDown() {
        driver.close();
    }

        @Test
        public void browserGoToGoogle () throws InterruptedException {
            driver.get("https:google.com");
            Thread.sleep(3000);
        }

        @Test
        public void getTwir () throws InterruptedException {
            PageNavigator nav = new PageNavigator(driver);
            HomePageTwir onHomePageTwir = nav.getHomePageTwir();
            Thread.sleep(3000);
        }
    @Test
    public void getAmazon () throws InterruptedException {
        PageNavigator nav = new PageNavigator(driver);
        AmazonPage onAmazonPage = nav.getAmazonPage();
        onAmazonPage.useCheckbox();
        Thread.sleep(3000);
    }
    //Checkboxes

    @Test
    public void getIronPage () throws InterruptedException {
        PageNavigator nav = new PageNavigator(driver);
        IronSpiderPage onIronPage = nav.getIronSpiderPage();
        onIronPage.useCheckBox();
        Thread.sleep(3000);
    }
    //Dropdowns;
@Test
    public void getSemanticPage () throws InterruptedException {
        PageNavigator nav = new PageNavigator(driver);
       SemanticPage onSemanticPage = nav.getSemanticPage();
       onSemanticPage.useMultiplyDropDown();
        Thread.sleep(3000);
    }
}
