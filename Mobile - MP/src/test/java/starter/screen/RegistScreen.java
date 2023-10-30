package starter.screen;

import io.appium.java_client.AppiumBy;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class RegistScreen extends BasePageObject {
    private By logoutBtn() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");}
    private By linkRegist() {
        return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }
    private By nameField() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"); }
    private By emailFiled() {  return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"); }
    private By passwordField() { return AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]"); }
    private By registerButton() { return AppiumBy.xpath("//android.widget.Button[@content-desc=\"Register\"]"); }
    private By productMessage() { return AppiumBy.xpath("//android.view.View[@content-desc=\"Products\"]xt"); }

    @Step
    public void onDashboard() { Assert.assertTrue(waitUntilVisible(logoutBtn()).isDisplayed()); }
    @Step
    public void onDashboardClick() { onClick(logoutBtn()); }
    @Step
    public void clickRegist() {onClick(linkRegist());}
    @Step
    public void inputName(String name) { onType(nameField(), name);}
    @Step
    public void inputEmailRegist(String email) { onType(emailFiled(), email);}
    @Step
    public void inputPasswordRegist(String password) { onType(passwordField(), password);}
    @Step
    public void tapRegistButton() {onClick(registerButton());}
    @Step
    public String getSuccessMessage() {
        return waitUntilVisible(logoutBtn()).getText();
    }


}
