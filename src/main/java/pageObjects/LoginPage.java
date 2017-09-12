package pageObjects;


import elements.Button;
import elements.Input;
import org.openqa.selenium.By;

public class LoginPage {
    private static LoginPage instance;

    private Input userName;
    private Input password;
    private Button login;

    public static LoginPage get(){
        if(instance == null){
             instance = new LoginPage().init();
        }
        return instance;
    }

    protected LoginPage init(){
        userName = new Input(By.id("email"));
        password = new Input(By.id("pass"));
        login = new Button(By.id("u_0_r"));
        return this;
    }

    public void setUserName(String strUserName){
        userName.setText(strUserName);
    }

    public void setPassword(String strPassword){
        password.setText(strPassword);
    }

    public void clickLogin(){
        login.click();
    }





}
