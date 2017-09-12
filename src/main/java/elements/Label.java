package elements;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import managers.InitDriver;
import org.openqa.selenium.By;


public class Label extends Elements {
    public Label(By locator) {
        super(locator);
        super.driver = InitDriver.get().getDriver();
    }

    public String getText(){
        if (isVisible())
            return driver.findElement(locator).getText();
        else
            throw new ElementNotFoundException("Element " + locator + " not found", "", "");
    }
}
