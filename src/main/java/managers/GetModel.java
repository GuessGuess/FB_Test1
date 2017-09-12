package managers;


import pageObjects.HomePage;
import pageObjects.LoginPage;

public class GetModel extends InitDriver {
    private static GetModel instance;

    public static GetModel get(){
        if(instance == null){
            instance = new GetModel();
        }
        return instance;
    }

    public LoginPage getLoginPage(){
        return LoginPage.get();
    }

    public HomePage getHomePage(){
        return HomePage.get();
    }



}
