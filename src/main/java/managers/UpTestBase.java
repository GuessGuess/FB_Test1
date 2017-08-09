package managers;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class UpTestBase extends InitDriver {

    @BeforeTest
    public void setUp(){
        InitDriver.get().getDriver().get("https://www.facebook.com/");
        System.out.println(InitDriver.get().getDriver().getTitle());
    }

    @AfterTest
    public  void Close(){
        InitDriver.get().getDriver().close();
    }
}
