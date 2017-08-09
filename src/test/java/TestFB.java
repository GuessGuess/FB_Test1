import managers.GetModel;
import org.testng.Assert;

public class TestFB extends GetModel {


    @org.testng.annotations.Test
    public void testLoginPage(){
        getUserAction().logIn("", "");
        Assert.assertTrue(getHomePage().getMyName().contains(""));
    }

    @org.testng.annotations.Test(dependsOnMethods = {"testLoginPage"})
    public void TestHomePage(){
        getUserAction().postSubmit("QQQQ");
        Assert.assertTrue(getHomePage().getPostStatus().contains("QQQQ"));
    }
}
