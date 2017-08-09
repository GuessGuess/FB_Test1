package elements;



public interface IElement {

    String getText();

    void click();

    void sendKeys(String strText);

    void clear();

    boolean isDisplayed();


}
