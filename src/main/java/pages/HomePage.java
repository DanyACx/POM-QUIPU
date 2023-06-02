package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {

    public HomePage(WebDriver driver){
        super(driver);
    }

    By opcionCatalogoLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-sider/div[1]/div/ul/li[1]/div[1]/span");
    By opcionGruposLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-sider/div[1]/div/ul/li[1]/div[2]/ul/li[3]/a");
    By botonNuevoGrupoLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-nuevo-grupo/div[1]/div/button");

    By pageGrupoLocator = By.xpath("/html/body/app-root/app-pages/nz-layout/nz-layout/nz-content/app-titulo-dashboard/span");

    String textoPageGrupoLocator = "Crear Grupo";

    public void hacerClick() throws Exception {
        this.esperaExplicitaClick(opcionCatalogoLocator, 5);
        this.click(opcionCatalogoLocator);

        this.esperaExplicitaClick(opcionGruposLocator, 5);
        this.click(opcionGruposLocator);

         Thread.sleep(2000);
    }

    public void hacerClickNuevo() throws Exception {
        this.esperaExplicitaClick(botonNuevoGrupoLocator, 5);
        this.click(botonNuevoGrupoLocator);
        // Thread.sleep(2000);
    }

    public boolean seVisualizaGrupoPage() throws Exception {
        //Thread.sleep(2000);
        this.esperaExplicitaTexto(pageGrupoLocator, textoPageGrupoLocator, 5);
        return this.seVisualiza(pageGrupoLocator);
    }

}
