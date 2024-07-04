package com.nttdata.steps;

import com.nttdata.screens.DemoAppScreen;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import net.serenitybdd.core.Serenity;



public class DemoAppSteps {
    DemoAppScreen demo;
    public void validarCargaProductos(){
        demo.esperarTitulo();
        Assert.assertTrue(demo.getCountElements()>2);
        Serenity.takeScreenshot();
    }

    public void clickProducto(String prod){
        demo.clickProducto(prod);
        Serenity.takeScreenshot();
    }

    public void agregarCantidad(int cant){
        demo.scrollDown();
        if (cant > 1) {
            for (int i = 0; i < cant; i++) {
                demo.incrementarCantidad();
            }
        }
        demo.clickAgregaralCarrito();
    }

    public void validarDatosCarrito(int cant){
        demo.clickCarrito();
        Assert.assertEquals("My Cart",demo.getTituloCarrito());
        Assert.assertEquals(String.valueOf(cant), demo.getCantidadCarrito());
    }
}
