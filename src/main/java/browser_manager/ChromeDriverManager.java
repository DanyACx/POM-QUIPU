package browser_manager;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager{

    @Override
    public void createDriver(){
        System.setProperty("webdriver.chrome.driver", "./src/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
