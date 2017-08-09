package elements;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import managers.InitDriver;
import org.openqa.selenium.By;


public class Button extends Elements {

    public Button(By locator) {
        super(locator);
        super.driver = InitDriver.get().getDriver();
    }

    public void click(){
        if(isVisible()){
            driver.findElement(locator).click();
        } else {
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
        }
    }
}
