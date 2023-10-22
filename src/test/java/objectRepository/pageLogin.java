package objectRepository;

import org.openqa.selenium.By;

public class pageLogin {

    //By field_username = By.name("user-name");
    By field_username =  By.xpath("//input[@data-test='username']");
    By field_password = By.id("password");
    By btn_login = By.xpath("//input[@type='submit'][@data-test='login-button']");
    By btn_menu = By.id("react-burger-menu-btn");
    By btn_logout = By.id("logout_sidebar_link");

//    By btn_menu = By.id("react-burger-menu-btn");
    By btn_about = By.id("about_sidebar_link");
    By about = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedAccentGreen MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-fullWidth MuiButton-root MuiButton-contained MuiButton-containedAccentGreen MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-disableElevation MuiButton-fullWidth css-as8hpy']");
//    public By getBtn_menu() {return  btn_menu; }
    public By getBtn_about() {return  btn_about; }
    public By getAbout() {return  about; }

    public By getField_username() {
        return field_username;
    }

    public By getField_password() {
        return field_password;
    }

    public By getBtn_login() {
        return btn_login;
    }

    public By getBtn_menu() {return  btn_menu; }

    public  By getBtn_logout() {return  btn_logout; }
}
