package hook;

import browser_manager.DriverManager;
import browser_manager.DriverManagerFactory;
import browser_manager.DriverType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hook {
    //private static WebDriver driver;
    private static WebDriver driver;
    private DriverManager driverManager;

    @BeforeMethod
    public void setUp(){
        // para quitar los logs
        System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.SimpleLog");
        System.setProperty("org.apache.commons.logging.simplelog.log.httpclient.wire", "OFF");
        System.setProperty("org.apache.commons.logging.simplelog.log.org.apache.commons.httpclient", "OFF");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");

        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
        driver.get("http://quipuincidencias.unmsm.edu.pe:8070/Q20/");  // 172.16.156.178:8006/Q20/
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void close(){driverManager.quitDriver();}

    /*public static WebDriver getDriver(){
        return driver;
    }*/

    public static WebDriver getDriver(){
        return driver;
    }
}