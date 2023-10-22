package stepDefinitions;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import objectRepository.pageLogin;

import java.io.File;
import java.io.IOException;

public class login extends env {

    public int duration = 10;
    WebDriverWait wait = new WebDriverWait(driver, duration); //create object
    pageLogin elementLogin = new pageLogin();

    @Given("user is on SauceDemo homepage")
    public void user_is_on_sauce_demo_homepage() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtn_login())
        );
    }

    @When("user input (.*) as username$")
    public void user_input_username(String username) {
        WebElement field_userName = driver.findElement(elementLogin.getField_username());
        field_userName.isDisplayed();
        field_userName.sendKeys(username);
    }

    @And("user input (.*) as password$")
    public void user_input_password(String password) {
        WebElement field_password = driver.findElement(elementLogin.getField_password());
        Assert.assertTrue(field_password.isEnabled());
        field_password.sendKeys(password);
    }

    @And("user click enter")
    public void user_click_enter() {
        WebElement field_password = driver.findElement(elementLogin.getField_password());
        field_password.sendKeys(Keys.ENTER);
    }

    @Then("user verify (.*) login result$")
    public void user_verify_success_login_result(String status) {
        if (status.contains("success")) {
            wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='header_secondary_container']/span[@class='title']"))
            );
        } else {
            driver.findElement(By.className("error-button"));
        }
    }

    @Then("user verify failed login")
    public void user_verify_failed_login() {
        driver.findElement(By.className("error-button"));
    }

    @And("user select button menu")
    public void user_select_button_menu() {
        driver.findElement(elementLogin.getBtn_menu()).click();
    }

    @And("select button log out")
    public void select_button_log_out() {
        driver.findElement(elementLogin.getBtn_logout()).click();
    }

    @Then("user back to login page")
    public void user_back_to_login_page() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getBtn_login())
        );
    }
    @When("user click menu")
    public void user_click_menu(){
        driver.findElement(elementLogin.getBtn_menu()).click();
    }
    @And("select button about")
    public void select_Button_About() {
        driver.findElement(elementLogin.getBtn_about()).click();
    }
    @Then("user go to page about")
    public void user_Go_To_Page_About() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(elementLogin.getAbout())
        );
    }

}




