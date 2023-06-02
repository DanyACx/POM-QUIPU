package base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;

public class Base {

    private WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    // Click sobre elemento de la web
    public void click(WebElement elemento)  throws Exception{
        try{
            elemento.click();
        }catch (Exception e){
            throw new Exception("No se pudo hacer click sobre el elemento: "+elemento);
        }
    }

    public void click(By locator)  throws Exception{
        try{
            driver.findElement(locator).click();
        }catch (Exception e){
            throw new Exception("No se pudo hacer click sobre el locator: "+locator);
        }
    }

    // para ver si elemento ya figura en web
    public boolean isDisplayed(By element) throws Exception {
        try{
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se pudo encontrar el elmento "+element);
        }
    }

    // obtener texto de elemento
    public String getText(By element) throws Exception {
        try{
            return driver.findElement(element).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elmento "+element);
        }
    }

    // obtenerexto de webElemento
    public String obtenerTexto(WebElement elemento) throws Exception {
        try{
            return elemento.getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del elemento: "+elemento);
        }
    }

    // obtener texto de locador
    public String obtenerTexto(By locator) throws Exception {
        try{
            return driver.findElement(locator).getText();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el texto del locator: "+locator);
        }
    }

    // obtener titulo de web
    public String getTitle() throws Exception {
        try{
            return driver.getTitle();
        }catch (Exception e){
            throw new Exception("No se pudo obtener el titulo del driver ");
        }
    }

    public void scroll(int num) throws Exception{
        try{
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,"+num+")");

        }catch (Exception e){
            throw new Exception("No se pudo hacer scroll");
        }
    }

    // ingresar texto
    public void ingresarTexto(String textoIngresado, By locator) throws Exception{
        try{
            driver.findElement(locator).sendKeys(textoIngresado);
        }catch (Exception e){
            throw new Exception("No se pudo ingresar texto: "+locator);
        }
    }

    // espera explicita texto
    public void esperaExplicitaTexto(By locator, String texto, int tiempo){
        WebDriverWait esperaElemento = new WebDriverWait(driver, tiempo);
        esperaElemento.until(ExpectedConditions.textToBe(locator, texto));
    }

    // espera explicita click
    public void esperaExplicitaClick(By locator, int tiempo){
        WebDriverWait esperaElemento = new WebDriverWait(driver, tiempo);
        esperaElemento.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // espera imagen
    public void esperaExplicitaImagen(By locator, int tiempo){
        WebDriverWait esperaElemento = new WebDriverWait(driver, tiempo);
        esperaElemento.until(ExpectedConditions.visibilityOfElementLocated(locator));
       // esperaElemento.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // encontrar elemento
    public WebElement encontrarElemento(By locator) throws Exception {
        try{
            return driver.findElement(locator);
        }catch (Exception e){
            throw new Exception("No se puedo encontrar al elemento: "+locator);
        }
    }

    public List<WebElement> encontrarElementos(By locator) throws Exception{
        try{
            return driver.findElements(locator);
        }catch (Exception e){
            throw  new Exception("NO se puedo encontrar elementos: "+ locator);
        }
    }

    // metodo para ver si el elemento se visualiza en pantalla
    public boolean seVisualiza(By locator) throws Exception {
        try{
            return driver.findElement(locator).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se puedo encontrar el lemento: "+locator);
        }
    }

    public void cargarArchivo(By locator, String ruta) throws Exception {
        try{
            File file = new File(ruta);
            String path = file.getAbsolutePath();
            driver.findElement(locator).sendKeys(path);

        }catch (Exception e){
            throw new Exception("No se cargar archivo: "+e);
        }
    }

   /* public void existencia(By locator) throws InterruptedException {

        Thread.sleep(30000);
        List<WebElement> lista = driver.findElements(locator);
        System.out.println(lista.size());
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i) + " AAA");
        }
    }*/

    public void cambioFrame(By locator) throws InterruptedException {
        Thread.sleep(1000);
        //First finding the element using any of locator stratedgy
        WebElement iframeElement = driver.findElement(locator);
        //now using the switch command
        driver.switchTo().frame(iframeElement);
    }

    public void frameDefecto() throws InterruptedException {
        Thread.sleep(1000);

        driver.switchTo().defaultContent();
    }

    public void seleccionarOpcionLista(By listaLocator, By lista, String valor) throws Exception {
        //Thread.sleep(2000);
        WebElement dropdown = driver.findElement(listaLocator);
        dropdown.click();

        WebElement dropdown2 = driver.findElement(lista);

        List<WebElement> opciones = dropdown2.findElements(By.tagName("li"));

        for(int i=0; i<opciones.size(); i++){
           // System.out.println(opciones.get(i).getText());
            if(this.obtenerTexto(opciones.get(i)).equals(valor)){
                this.click(opciones.get(i));
            }
        }
    }

}
