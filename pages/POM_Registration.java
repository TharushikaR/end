import org.openqa.selenium.*;

public class POM_Registration {
    WebDriver driver;

    By RegLink=By.linkText("REGISTER");
    By fName=By.name("firstName");
    By lName=By.name("lastName");
    By phone=By.name("phone");
    By email=By.name("userName");
    By address=By.name("address1");
    //By address2=By.name("REGISTER");
    By city=By.name("city");
    By state=By.name("state");
    By postalcode=By.name("postalCode");
    By country=By.name("country");
    By username=By.name("email");
    By pswd=By.name("password");
    By confirmPswd=By.name("confirmPassword");
    By regBtn=By.name("submit");

    POM_Registration(WebDriver d){
        driver=d;
    }

    public void clickRegLink(){
        driver.findElement(RegLink).click();
    }
    public void setFirstName(String f_Name){
        driver.findElement(fName).sendKeys(f_Name);
    }
    public void setLastName(String l_Name){
        driver.findElement(lName).sendKeys(l_Name);
    }
    public void setPhone(String p_num){
        driver.findElement(phone).sendKeys(p_num);
    }
    public void setEmail(String e_mail){
        driver.findElement(email).sendKeys(e_mail);
    }
    public void setAddress(String adrs){
        driver.findElement(address).sendKeys(adrs);
    }
    public void setCity(String city_name){
        driver.findElement(city).sendKeys(city_name);
    }
    public void setState(String state_name){
        driver.findElement(state).sendKeys(state_name);
    }
    public void setPostalcode(String p_code){
        driver.findElement(postalcode).sendKeys(p_code);
    }
    public void setCountry(String country_name){
        driver.findElement(country).sendKeys(country_name);
    }
    public void setUsername(String u_name){
        driver.findElement(username).sendKeys(u_name);
    }
    public void setPswd(String pwd){
        driver.findElement(pswd).sendKeys(pwd);
    }
    public void setConfirmPswd(String cpwd){
        driver.findElement(confirmPswd).sendKeys(cpwd);
    }
    public void setRegBtn(){
        driver.findElement(regBtn).click();
    }
}
