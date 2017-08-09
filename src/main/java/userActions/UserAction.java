package userActions;


import pageObjects.HomePage;
import pageObjects.LoginPage;

public class UserAction {
    private static UserAction instance;

    public static UserAction get(){
        if(instance == null){
            instance = new UserAction();
        }
        return instance;
    }

    public void postDelete(){
        HomePage.get().clickPostButton();
        HomePage.get().clickPostDelete();
    }

    public void postSubmit(String setText){
        HomePage.get().setPost(setText);
        HomePage.get().clickSubmit();
    }

    public void quit(){
        HomePage.get().clickUserNavigationLabel();
        HomePage.get().clickExit();
    }

    public  void logIn(String strUserName, String strPassword){
        LoginPage.get().setUserName(strUserName);
        LoginPage.get().setPassword(strPassword);
        LoginPage.get().clickLogin();
    }
}
