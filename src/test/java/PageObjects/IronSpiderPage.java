package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IronSpiderPage extends  PageNavigator{

    public IronSpiderPage(WebDriver driver){
        super(driver);
    }


    public void useCheckBox(){
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"Content\"]/div[1]/blockquote[1]/form/input[1]"));
        checkbox1.click();
    }
}
