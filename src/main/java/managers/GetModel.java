package managers;


import pageObjects.HomePage;
import pageObjects.LoginPage;
import userActions.UserAction;

public class GetModel extends InitDriver {

    public LoginPage getLoginPage(){
        return LoginPage.get();
    }

    public HomePage getHomePage(){
        return HomePage.get();
    }

    public UserAction getUserAction(){
        return UserAction.get();
    }

}
