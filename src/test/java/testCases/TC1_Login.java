package testCases;

import hook.Hook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class TC1_Login extends Hook {

    @Test
    public void Login() throws Exception {

        // WebDriver driver = Hook.getDriver();
        WebDriver driver = Hook.getDriver();
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.loginPageVisualizada());
        loginPage.ingresarCredenciales();
        loginPage.hacerClick();
        Assert.assertTrue(loginPage.seVisualizaHomePage());
    }
}
