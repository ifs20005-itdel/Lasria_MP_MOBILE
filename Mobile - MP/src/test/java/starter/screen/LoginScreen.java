package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By logoutBtn() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");}
    private By emailFiled() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");}

    private By passwordField() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButton() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By productsPage() {
        return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
    }


    @Step ("user on dashboard for login")
    public void onDashboard() { Assert.assertTrue(waitUntilVisible(logoutBtn()).isDisplayed()); }
    @Step ("user click logout for login")
    public void onDashboardClick() { onClick(logoutBtn()); }
    @Step ("user click email field")
    public void onLoginPage() {
        Assert.assertTrue(waitUntilVisible(loginButton()).isDisplayed());
    }
    @Step ("user input valid email")
    public void onClickEmailField() { onClick(emailFiled()); }
    @Step ("user input valid email")
    public void inputEmail(String email) {
        onType(emailFiled(), email);
    }
    @Step ("user click password field")
    public void onClickPasswordField() { onClick(passwordField()); }
    @Step ("user input valid password")
    public void inputPassword(String password) {
        onType(passwordField(), password);
    }

    @Step ("user click login button")
    public void tapLoginButton() {
        onClick(loginButton());
    }

    @Step
    public String onHomepage() {
        return waitUntilVisible(productsPage()).getText();
    }

}
