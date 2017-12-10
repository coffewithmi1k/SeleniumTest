package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SemanticPage extends PageNavigator {
    public SemanticPage(WebDriver driver){
        super(driver);
    }


    public void useMultiplyDropDown(){
        Select dropdown1 = new Select( driver.findElement(By.className("ui fluid search dropdown")));
        dropdown1.selectByVisibleText("Alabama");
        dropdown1.selectByVisibleText("Alaska");
        dropdown1.selectByVisibleText("Arizona");
    }
}
