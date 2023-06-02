package browser_manager;


import org.openqa.selenium.opera.OperaDriver;

public class OperaDriverManager extends DriverManager {

    @Override
    public void createDriver() {
        System.setProperty("webdriver.opera.driver", "./src/resources/operadriver/operadriver.exe");

        driver = new OperaDriver();
    }

}

