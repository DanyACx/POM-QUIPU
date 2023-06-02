package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GrupoPage extends Base {

    public GrupoPage(WebDriver driver){
        super(driver);
    }

    By inputNombreGrupoLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-crear-grupo/nz-card/div/div[1]/div[2]/nz-input-group/span/input");

    By item1Locator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-crear-grupo/nz-card/div/div[1]/div[1]/app-nuevo-grupo-servicios/div/div/div/nz-tabset/div/div/div[1]/div/app-destacar-servicios-tarifario/nz-table/nz-spin/div/div/nz-table-inner-default/div/table/tbody/tr[1]/td[5]/i[2]");
    By item2Locator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-crear-grupo/nz-card/div/div[1]/div[1]/app-nuevo-grupo-servicios/div/div/div/nz-tabset/div/div/div[1]/div/app-destacar-servicios-tarifario/nz-table/nz-spin/div/div/nz-table-inner-default/div/table/tbody/tr[2]/td[5]/i[2]");

    By botonCrearGrupoLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-crear-grupo/nz-card/div/div[2]/button[2]");

    By botonAceptarLocator = By.xpath("/html/body/div/div[3]/div/nz-modal-confirm-container/div/div/div/div/div[2]/button[2]/span");

    By confirmarLocation = By.xpath("/nz-notification/div/div/div/div/div[1]");

    // verificar creacion
    By grupoConfirmarLocation = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-titulo-dashboard/span");
    By inputGrupoLocation = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-nuevo-grupo/div[2]/app-filtro-tarifario/div/nz-input-group/span/span[1]/input");
    By botonGrupoLocation = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-nuevo-grupo/div[2]/app-filtro-tarifario/div/nz-input-group/span/span[2]/button");
    By encontrarGrupoLocation = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-nuevo-grupo/nz-table/nz-spin/div/div/nz-table-inner-default/div/table/tbody/tr/td[2]");

    String textoGrupoConfirmarLocation = "Grupos";
    String textoInputGrupoLocation = "S/ 16.50";


    String textoConfirmarLocation = "Bien";

    public void ingresarNombreGrupo() throws Exception {
        this.ingresarTexto("prueba grupo 2", inputNombreGrupoLocator);
    }

    public void clickAgregar() throws Exception {
        this.esperaExplicitaClick(item1Locator, 5);
        this.click(item1Locator);

        this.esperaExplicitaClick(item2Locator, 5);
        this.click(item2Locator);

        this.scroll(100);
         Thread.sleep(2000);
    }

    public void clickCrear() throws Exception {
        this.esperaExplicitaClick(botonCrearGrupoLocator, 5);
        this.click(botonCrearGrupoLocator);
    }

    public void clickAceptar() throws Exception {
        this.esperaExplicitaClick(botonAceptarLocator, 5);
        this.click(botonAceptarLocator);
    }

    public void seVisualizaConfirmacionPage() throws Exception {
        //Thread.sleep(2000);
        this.esperaExplicitaTexto(grupoConfirmarLocation, textoGrupoConfirmarLocation, 5);
        this.ingresarTexto("PRUEBA GRUPO 2 ", inputGrupoLocation);
        this.click(botonGrupoLocation);
       // Thread.sleep(2000);
        this.esperaExplicitaTexto(encontrarGrupoLocation, textoInputGrupoLocation, 5);

    }

}
