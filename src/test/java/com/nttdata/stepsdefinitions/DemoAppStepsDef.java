package com.nttdata.stepsdefinitions;

import com.nttdata.steps.DemoAppSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DemoAppStepsDef {
    @Steps
    DemoAppSteps demo;

    @Given("estoy en la aplicación")
    public void estoyEnLaAplicación() {
    }

    @And("valido que carguen correctamente los productos en la galería")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGalería() {
        demo.validarCargaProductos();
    }

    @When("doy clic en {string}")
    public void doyClicEn(String prod) {
        demo.clickProducto(prod);
    }

    @And("agrego {int} del producto")
    public void agregoUNIDADESDelProducto(int cant) {
        demo.agregarCantidad(cant);
    }


    @Then("valido que el carrito de compras se actualice correctamente con la cantidad ingresada {int}")
    public void validoQueElCarritoDeComprasSeActualiceCorrectamenteConLaCantidadIngresadaUNIDADES(int cant) {
        demo.validarDatosCarrito(cant);
    }
}
