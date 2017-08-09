package managers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class InitDriver {
    private static InitDriver instance;
    private WebDriver driver;

    public static InitDriver get(){
        if(instance == null){
            instance = new InitDriver().init();
        }
        return instance;
    }

    protected InitDriver init(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Алла\\Desktop\\geckodriver-v0.17.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return this;
    }

    public WebDriver getDriver(){
        return driver;
    }
}
