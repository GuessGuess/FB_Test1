package pageObjects;


import elements.Button;
import elements.Input;
import elements.Label;
import org.openqa.selenium.By;

public class HomePage {
    private static HomePage instance;

    private Input post;
    private Button submit;
    private Button userNavigationLabel;
    private Button exit;
    private Button postButton;
    private Button postDelete;
    private Label myName;
    private Label postStatus;


    public static HomePage get(){
        if(instance == null){
            instance = new HomePage().init();
        }
        return instance;
    }

    protected HomePage init(){
        post = new Input(By.xpath(".//*[@id='js_f4']/div[1]/div/div[1]/div[2]/div/div/div"));
        submit = new Button(By.id(".//*[@id='js_f4']/div[2]/div[3]/div/div[2]/div/button"));
        userNavigationLabel = new Button(By.id("userNavigationLabel"));
        exit = new Button(By.xpath(".//*[@id='js_2p']/div/div/ul/li[16]/a/span/span"));
        postButton = new Button(By.id("u_15_3"));
        postDelete = new Button(By.id(".//*[@id='u_17_0']/div/ul/li[1]/a/span/span"));
        postStatus = new Label(By.xpath(".//*[@id='js_19g']/div/p"));
        myName = new Label(By.xpath(".//*[@id='navItem_100000988949083']/a/div"));
        return this;
    }



    public void setPost(String strText){
        post.setText(strText);
    }

    public void clickSubmit(){
        submit.click();
    }

    public void clickUserNavigationLabel(){
        userNavigationLabel.click();
    }

    public void clickExit(){
        exit.click();
    }

    public void clickPostButton(){
        postButton.click();
    }

    public void clickPostDelete(){
        postDelete.click();
    }

    public String getMyName(){
        return myName.getText();
    }

    public String  getPostStatus(){
        return postStatus.getText();
    }





}
