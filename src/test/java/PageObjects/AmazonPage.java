package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPage extends PageNavigator {

    public AmazonPage(WebDriver driver){
        super(driver);
    }

    public void useCheckbox(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        WebElement waitfor;

        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"));
        waitfor= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"leftNav\"]/ul[1]/div/li[1]/span/span/div/label/input")));
        WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"leftNav\"]/ul[1]/div/li[1]/span/span/div/label/input"));
        checkbox1.click();
    }



}
