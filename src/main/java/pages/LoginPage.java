package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    By tituloLocator = By.cssSelector("#toolLogin-btnInnerEl");  //  By tituloLocator = By.id("toolLogin-btnInnerEl");

    By ventanaLoginLocator = By.id("toolLogin-btnInnerEl"); //  By ventanaLoginLocator = By.id("app-image-banner");

    By emailLocator = By.id("textfield-1023-inputEl");
    By passwordLocator = By.id("textfield-1024-inputEl");
    By botonLocator = By.id("button-1026-btnIconEl");

    By ventanaLocator = By.id("toolLogout-btnIconEl");

    By verificarTituloLocator = By.id("toolLogin-btnInnerEl");

    // para el frame
    By frameLocator = By.xpath("//frame[@src='../byt/default.html']");
    // By frameLocator = By.cssSelector("frame[src='../byt/default.html']");

    public boolean loginPageVisualizada() throws Exception {
       // Thread.sleep(2000);
      //  this.cambioFrame(frameLocator);
        this.esperaExplicitaImagen(tituloLocator, 5);

        return this.seVisualiza(tituloLocator);
    }

    public void hacerClickVentana() throws Exception {
        Thread.sleep(2000);
        this.encontrarElemento(ventanaLoginLocator);
        this.esperaExplicitaClick(ventanaLoginLocator, 5);
        this.click(ventanaLoginLocator);
       // Thread.sleep(2000);
    }

    public void ingresarCredenciales() throws Exception {
        this.ingresarTexto("MP-DGA", emailLocator); // 07726284
        this.ingresarTexto("11111", passwordLocator);
    }

    public void hacerClick() throws Exception {
        this.esperaExplicitaClick(botonLocator, 5);
        this.click(botonLocator);

    }

    public boolean seVisualizaHomePage() throws Exception {
        //Thread.sleep(2000);
        this.esperaExplicitaImagen(ventanaLocator, 5);
        return this.seVisualiza(ventanaLocator);
    }

    /*public void verificarExistencia() throws InterruptedException {
        this.existencia(verificarTituloLocator);
    }*/

    public void cambioDeFrame() throws InterruptedException {
        this.cambioFrame(frameLocator);
    }

    public void llevarDefecto() throws InterruptedException {
        this.frameDefecto();
        Thread.sleep(1000);
    }
}

