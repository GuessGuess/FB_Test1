package elements;


import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import managers.InitDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Elements implements IElement {
    public By locator;
    protected WebDriver driver;

    public Elements(By locator){
        this.locator = locator;
        this.driver = InitDriver.get().getDriver();
    }

    protected boolean isVisible(){
        int size = driver.findElements(locator).size();
        return size == 0 ? false : true;
    }

    public String getText(){
        if (isVisible())
            return driver.findElement(locator).getText();
        else
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
    }

    public void click(){
        if (isVisible())
            driver.findElement(locator).click();
        else
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
    }


    public void setText(String strText) {
        if (isVisible()){
            driver.findElement(locator).sendKeys(strText);
        } else
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
    }

    public void clear() {
        if (isVisible()){
            driver.findElement(locator).clear();
        } else
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
    }

    public boolean isDisplayed(){
        if(isVisible()){
            driver.findElement(locator).isDisplayed();
        }
        else
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
        return false;
    }
}
