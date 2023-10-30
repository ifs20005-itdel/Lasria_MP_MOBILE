package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
//import starter.screen.InvalidLoginScreen;
////import starter.screen.LoginScreen;
//import starter.screen.InvalidRegistEmailScreen;
//import starter.screen.InvalidRegisterNameScreen;
import starter.screen.RegistScreen;
import starter.screen.LoginScreen;

public class UserSteps {
    @Steps
    RegistScreen regist;
    @Steps
    LoginScreen login;

    @Given("user on dashboard for login")
    public void userOnLoginPageForLogin() { login.onDashboard();
    }
    @When("user click logout for login")
    public void userClickLogoutForLogin() { login.onDashboardClick();
    }
    @And("user on login page for login")
    public void userOnLoginPage() { login.onLoginPage();}
    @And("user click email field")
    public void userClickEmailField() { login.onClickEmailField();}
    @And("user input valid email")
    public void userInputEmailForLogin() {login.inputEmail("zaldirizald@gmail.com");}
    @And("user click password field")
    public void userClickPasswordField() { login.onClickPasswordField();}
    @And("user input invalid password")
    public void userInputPasswordForLogin() {login.inputPassword("zaldirizaldajah");}
    @And("user click login button")
    public void userClickBtnLogin() {login.tapLoginButton();}
    @Then("user can see hompegae and list products")
    public void userSuccessLogin() { login.onHomepage();}



    // ========== valid regist ===========
    @Given("user on dashboard")
    public void userOnLoginPageForRegist() { regist.onDashboard();
    }
    @When("user click logout")
    public void userClickLogout() { regist.onDashboardClick();
    }
    @And("user click link regist")
    public void userClickRegist() {regist.clickRegist();
    }
    @And("user input name")
    public void userInputName() {regist.inputName("Muhammad Rizaldi Dwinanto");
    }
    @And("user input email")
    public void userInputEmail() {regist.inputEmailRegist("zaldirizald@gmail.com");}
    @And("user input password")
    public void userInputPassword() {regist.inputPasswordRegist("zaldirizaldajah");
    }
    @And("user click resgister button")
    public void userClickRegistButton() {
        regist.tapRegistButton();
    }
    @Then("user direct to home page")
    public void userSeeSuccessMessage() {  regist.getSuccessMessage();}

}
