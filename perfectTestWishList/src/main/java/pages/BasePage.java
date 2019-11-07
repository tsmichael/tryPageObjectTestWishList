package pages;


import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver,15);
    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

//Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

//Write text
    public void writeText(By elementBy,String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

// expected and actual
    public void assertEquals(String actualResult){
        Assert.assertEquals(actualResult, "Product in WishList");
    }
}
