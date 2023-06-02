package browser_manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.gecko.driver", "./src/resources/firefoxdriver/geckodriver.exe");
        driver = new FirefoxDriver();
    }
}
