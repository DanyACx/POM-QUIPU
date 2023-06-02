package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AsignarDeudaPage extends Base {

    public AsignarDeudaPage(WebDriver driver){
        super(driver);
    }

    By opcionDeudasLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-sider/div[1]/div/ul/li[3]/div[1]");
    By asignarDeudaLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-sider/div[1]/div/ul/li[3]/div[2]/ul/li[1]/a");

    By inputDocumentoLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-asignar-deuda/div/div[2]/app-step-persona/div[1]/div[1]/nz-input-group/input");
    By botonAgregarLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-asignar-deuda/div/div[2]/app-step-persona/div[1]/div[2]/button");
    By botonContinuar1Locator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-asignar-deuda/div/div[2]/app-step-persona/div[3]/button");
    By botonProductoLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-asignar-deuda/div/div[2]/app-step-producto/div/app-tipo-producto/div/div/div/div[1]/div[1]/button");
    By seleccionarProductoLocator = By.xpath("(//span[@class='ant-checkbox'])[3]");
    By botonContinuar2Locator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-asignar-deuda/div/div[2]/app-step-producto/div/app-select-tarifario/div/div[2]/div/button");
    By botonContinuar3Locator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-asignar-deuda/div/div[2]/app-step-cuotas/div[2]/button[2]");
    By botonFinalizarLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-asignar-deuda/div/div[2]/app-step-finalizar/div[3]/button[2]");

    By botonAceptarLocator = By.xpath("//span[normalize-space()='Aceptar']");

    By popUpFelicitacionesLocator = By.xpath("/nz-notification/div/div/div/div/div[1]");

    public void clicDeudas() throws Exception {
        this.esperaExplicitaClick(opcionDeudasLocator, 5);
        this.click(opcionDeudasLocator);
    }

    public void clicAsignarDeudas() throws Exception {
        this.esperaExplicitaClick(asignarDeudaLocator, 5);
        this.click(asignarDeudaLocator);
    }

    public void agregarPersona() throws Exception {
        this.esperaExplicitaClick(inputDocumentoLocator, 5);
        this.ingresarTexto("12345678", inputDocumentoLocator);
        this.click(botonAgregarLocator);

        this.esperaExplicitaClick(botonContinuar1Locator, 5);
        this.click(botonContinuar1Locator);
    }

    public void elegirProducto() throws Exception {
        this.esperaExplicitaClick(botonProductoLocator, 5);
        this.click(botonProductoLocator);

        this.esperaExplicitaClick(seleccionarProductoLocator, 5);
        this.click(seleccionarProductoLocator);

        this.scroll(250);
        this.click(botonContinuar2Locator);
    }

    public void elegirCuota() throws Exception {
        this.esperaExplicitaClick(botonContinuar3Locator, 5);
        this.click(botonContinuar3Locator);

        this.esperaExplicitaClick(botonFinalizarLocator, 5);
        this.click(botonFinalizarLocator);

        this.esperaExplicitaClick(botonAceptarLocator, 5);
        this.click(botonAceptarLocator);

    }
}
