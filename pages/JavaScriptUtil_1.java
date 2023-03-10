import org.openqa.selenium.*;
public class JavaScriptUtil_1 {
    //Flashing Element
    public static void flash(WebElement element, WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        String bgcolor=element.getCssValue("backgroundColor");
        for (int i=0;i<500;i++){
            changeColor("#000000",element,driver); //1
            changeColor(bgcolor,element,driver); //2
        }
    }

    public static void changeColor(String color, WebElement element, WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",element);
        try {
            Thread.sleep(20);
        }catch (InterruptedException e){
            System.out.println("Exception "+e);
        }
    }
    //Drawing a border around the element
    public static void drawBorder(WebElement element,WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.border='3px solid red'",element);
    }

    //capture the title of the page
    public static String getTitleByJS(WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        String title=js.executeScript("return document.title;").toString();
        return title;
    }

    //Click in some element
    public static void clickElementByJS(WebElement element,WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();",element);
    }

    //Generate alert information
    public static void generateAlert(WebDriver driver,String msg){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("alert('"+msg+"')");
    }

    //Refreshing page
    public static void refreshBrowserByJS(WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("history.go(0)");
    }

    //Scroll down the page till find the element
    public static void scrollIntoView(WebElement element,WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }

    //Scroll down the page till bottom of the page
    public static void scrollPageDown(WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

}
