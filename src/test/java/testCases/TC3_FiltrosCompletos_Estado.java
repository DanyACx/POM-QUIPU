package testCases;

import hook.Hook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DetalleHrPage;
import pages.LoginPage;


public class TC3_FiltrosCompletos_Estado extends Hook{

    @Test
    public void FiltrosCompletos_Estad() throws Exception {

        WebDriver driver = Hook.getDriver();
        LoginPage loginPage = new LoginPage(driver);
        DetalleHrPage detalleHrPage = new DetalleHrPage(driver);

        loginPage.cambioDeFrame();
        Assert.assertTrue(loginPage.loginPageVisualizada());
        loginPage.hacerClickVentana();
        loginPage.ingresarCredenciales();
        loginPage.hacerClick();

        detalleHrPage.clicOpcionSeguimientoHR();
        Assert.assertTrue(detalleHrPage.seVisualizaModulo());

        detalleHrPage.seleccionarAnio();
        detalleHrPage.seleccionarEstado();
        detalleHrPage.ingresarFecha();
        detalleHrPage.ingresarNHRuta();
        detalleHrPage.clicBuscar();
        Assert.assertTrue(detalleHrPage.seVisualizaResultados());
    }

}
