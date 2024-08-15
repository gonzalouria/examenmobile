package com.nttdata.stepsdefinitions;

import com.nttdata.steps.ProductSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ProductStepDef {

    @Steps
    ProductSteps productSteps;


    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicaciónDeSauceLabs() {
        productSteps.verificarCarga();

    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        productSteps.verificoCargaProducto();

    }



    @When("agrego {int} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(int unidades, String producto) {
        productSteps.hacerClick(producto);
        productSteps.agregarUnidades(unidades);



    }



    @Then("valido el carrito de compra actualice correctamente con {string} y del {string}")
    public void validoElCarritoDeCompraActualiceCorrectamenteConUNIDADESYDel(String unidades,String producto) {
        productSteps.validoCarrito(unidades,producto);
    }
}
