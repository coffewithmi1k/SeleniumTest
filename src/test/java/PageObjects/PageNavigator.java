package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageNavigator {

    WebDriver driver;

    public PageNavigator (WebDriver driver){
        this.driver = driver;
    }

    public HomePageTwir getHomePageTwir(){
        driver.get("Http:twirpx.com");
        return new HomePageTwir(driver);
    }

    public AmazonPage getAmazonPage(){
        driver.get("Https:amazon.com");
        return new AmazonPage(driver);
    }
    public IronSpiderPage getIronSpiderPage(){
        driver.get("http:www.ironspider.ca/forms/checkradio.htm");
        return new IronSpiderPage(driver);
    }

    public SemanticPage getSemanticPage(){
        driver.get("https:semantic-ui.com/modules/dropdown.html");
        return  new SemanticPage(driver);
    }
}
