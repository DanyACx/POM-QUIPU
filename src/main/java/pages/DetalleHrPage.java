package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetalleHrPage extends Base {

    public DetalleHrPage(WebDriver driver){
        super(driver);
    }

    By frameLocator = By.xpath("//frame[@src='../byt/default.html']");
    By opcionSeguimientoHrLocator = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/table[1]/tbody[1]/tr[4]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]");

    By verMovimientosLocator = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[1]");

    By anioValorLocator = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[1]/span/div/div/div/div/div/div[1]/div/div/div/div[3]/div/div/div/table[2]/tbody/tr/td[2]/table/tbody/tr/td[2]/div");
    By anioSeleccionLocator = By.xpath("/html/body/div[8]/div[1]");
    By fechaCalendar = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[1]/span/div/div/div/div/div/div[3]/div/div/div/div[3]/div/div/div/table[1]/tbody/tr/td[2]/table/tbody/tr/td[1]/input");
    By NHRuta = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[1]/span/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/table[1]/tbody/tr/td[2]/input");
    By buscarBotonLocator = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/a/span/span");
    By resultadoRegistroLocator = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[3]/div/table/tbody/tr/td[2]/div/span");
    By resultadoNuloLocator = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[4]/div/div/div[3]");

    By estadoValorLocator = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[1]/span/div/div/div/div/div/div[1]/div/div/div/div[1]/div/div/div/table[2]/tbody/tr/td[2]/table/tbody/tr/td[2]/div");
    By estadoSeleccionLocator = By.xpath("/html/body/div[9]/div[1]");
    By resultadosLocator = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[3]/div/table/tbody/tr/td[1]/div");
    By movimientosBuscarLocator = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/a[1]");
    By resultadoMovimientoLocator = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div[2]/div[3]/div/table/tbody/tr[1]/td[4]/div");
    By verRegistrosBotonLocator = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div/div/a[2]");
    By resultadoVerRegistroLocator = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div[2]/div[3]/div/table/tbody/tr/td[2]/div");

    public void clicOpcionSeguimientoHR() throws Exception {
        this.esperaExplicitaClick(opcionSeguimientoHrLocator, 5);
        this.click(opcionSeguimientoHrLocator);
        Thread.sleep(15000);
    }

    public boolean seVisualizaModulo() throws Exception {
        //Thread.sleep(2000);
        this.esperaExplicitaImagen(verMovimientosLocator, 5);
        return this.seVisualiza(verMovimientosLocator);
    }

    public void cambioDeFrame1() throws InterruptedException {
        this.cambioFrame(frameLocator);
    }

    public void llevarDefecto() throws InterruptedException {
        this.frameDefecto();
        Thread.sleep(1000);
    }

    public void seleccionarAnio() throws Exception {
        this.seleccionarOpcionLista(anioValorLocator, anioSeleccionLocator, "2022");
        Thread.sleep(2000);
    }

    public void ingresarFecha() throws Exception {
        this.ingresarTexto("01/12/2022", fechaCalendar);
        Thread.sleep(2000);
    }

    public void ingresarNHRuta() throws Exception {
        this.esperaExplicitaClick(buscarBotonLocator, 5);
        this.ingresarTexto("22032041", NHRuta);
    }

    public void ingresarNHRutaInvalido() throws Exception {
        this.esperaExplicitaClick(buscarBotonLocator, 5);
        this.ingresarTexto("21032150", NHRuta);
    }

    public void clicBuscar() throws Exception {
        this.esperaExplicitaClick(buscarBotonLocator, 5);
        this.click(buscarBotonLocator);
    }

    public boolean seVisualizaResultadosInvalidosHR() throws Exception {
        this.esperaExplicitaTexto(resultadoNuloLocator, "de 0", 5);
        this.esperaExplicitaImagen(resultadoNuloLocator, 10);
        return this.seVisualiza(resultadoNuloLocator);
    }

    public boolean seVisualizaResultados() throws Exception {
        Thread.sleep(15000);
        this.esperaExplicitaTexto(resultadoRegistroLocator, "22032041", 25);
        this.esperaExplicitaImagen(resultadoRegistroLocator, 10);
        return this.seVisualiza(resultadoRegistroLocator);
    }

    public void seleccionarEstado() throws Exception {
        Thread.sleep(4000);
        this.esperaExplicitaImagen(estadoValorLocator, 10);
      //  this.esperaExplicitaImagen(estadoSeleccionLocator, 20);
        this.seleccionarOpcionLista(estadoValorLocator, estadoSeleccionLocator, "Asignado");
      //  this.ingresarTexto("Enviado", estadoSeleccionLocator);
      // Thread.sleep(2000);
    }

    public void clicResultados() throws Exception {
        this.esperaExplicitaClick(resultadosLocator, 5);
        this.click(resultadosLocator);
    }

    public void clicBotonMovimientos() throws Exception {
        this.esperaExplicitaClick(movimientosBuscarLocator, 5);
        this.click(movimientosBuscarLocator);
    }

    //

    public boolean seVisualizaMovimientos() throws Exception {
        this.esperaExplicitaTexto(resultadoMovimientoLocator, "CREADO", 25);
        this.esperaExplicitaImagen(resultadoMovimientoLocator, 10);
        return this.seVisualiza(resultadoMovimientoLocator);
    }

    public void clicBotonVerRegistros() throws Exception {
        this.esperaExplicitaClick(verRegistrosBotonLocator, 5);
        this.click(verRegistrosBotonLocator);
    }

    public boolean seVisualizaVerRegistros() throws Exception {
        this.esperaExplicitaTexto(resultadoVerRegistroLocator, "Req. Directo", 25);
        this.esperaExplicitaImagen(resultadoVerRegistroLocator, 10);
        return this.seVisualiza(resultadoVerRegistroLocator);
    }
}
