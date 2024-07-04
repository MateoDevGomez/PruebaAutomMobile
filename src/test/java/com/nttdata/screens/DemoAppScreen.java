package com.nttdata.screens;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
public class DemoAppScreen extends PageObject {

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc=\"Displays all products of catalog\"]/android.view.ViewGroup")
    private List<WebElement> listaProds;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement tituloApp;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Increase item quantity\"]")
    private WebElement btnIncrementar;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnAgregarCarrito;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement btnCarrito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement tituloCarrito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement textCantidad;

    public void esperarTitulo(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(tituloApp));
    }

    public int getCountElements(){
        return listaProds.size();
    }
    public void clickProducto(String prod) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        String xpath = "//android.widget.ImageView[@content-desc='" + prod + "']";
        System.out.println(xpath);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        element.click();
    }
    public void scrollDown(){
        ScrollActions scrollActions = new ScrollActions(getDriver());
        scrollActions.scrollDown();
    }
    public void incrementarCantidad() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(btnIncrementar));
        btnIncrementar.click();
    }
    public void clickAgregaralCarrito(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(btnAgregarCarrito));
        btnAgregarCarrito.click();
    }
    public void clickCarrito(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(btnCarrito));
        btnCarrito.click();
    }
    public String getTituloCarrito(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(tituloCarrito));
        return tituloCarrito.getText();
    }
    public String getCantidadCarrito(){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(textCantidad));
        return textCantidad.getText();
    }


}
