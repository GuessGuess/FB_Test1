package elements;


import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import managers.InitDriver;
import org.openqa.selenium.By;

public class Input extends Elements {




    public Input(By locator) {
        super(locator);
        super.driver = InitDriver.get().getDriver();
    }

    public void setText(String strText){
        if(isVisible()){
            driver.findElement(locator).sendKeys(strText);
        } else {
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
        }
    }

    public void clear(){
        if (isVisible()){
            driver.findElement(locator).clear();
        } else {
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
        }
    }
}
