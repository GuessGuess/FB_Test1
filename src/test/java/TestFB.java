import managers.GetModel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFB  {


    @org.testng.annotations.Test
    public void testLogIn(){
        GetModel.get().getLoginPage().setUserName("");
        GetModel.get().getLoginPage().setPassword("");
        GetModel.get().getLoginPage().clickLogin();
        Assert.assertTrue(GetModel.get().getHomePage().getMyName().contains(""));
    }

    @org.testng.annotations.Test(dependsOnMethods = {"testLogIn"})
    public void testPostSubmit(){
        GetModel.get().getHomePage().setPost("OOO");
        GetModel.get().getHomePage().clickSubmit();
        Assert.assertTrue(GetModel.get().getHomePage().getPostStatus().contains("QQQQ"));
    }

    @Test(dependsOnMethods = {"testPostSubmit"} )
    public void testPostDelete(){
        GetModel.get().getHomePage().clickPostButton();
        GetModel.get().getHomePage().clickPostDelete();
    }

    @Test(dependsOnGroups = {"testPostDelete"})
    public void testQuitMyProfile(){
        GetModel.get().getHomePage().clickUserNavigationLabel();
        GetModel.get().getHomePage().clickExit();
        Assert.assertTrue(GetModel.get().getHomePage().getMyName().contains(""));
    }
}
