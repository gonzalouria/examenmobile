package com.nttdata.steps;

import com.nttdata.screens.ProductScreen;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class ProductSteps {

    ProductScreen productScreen;

    public void verificarCarga() {

    Assert.assertTrue(productScreen.isProductDisplayed());


    }

    public void hacerClick(String productos) {


        switch (productos){
            case "Sauce Labs Backpack":
                productScreen.clickOnProduct();
                break;
            case "Sauce Labs Bolt - T-Shirt":
                productScreen.clickOnProduct2();
                break;
            case "Sauce Labs Bike Light":
                productScreen.clickOnProduct3();
                Assert.fail("Se cerro inesperadamente");

                break;



        }


    }

    public void verificoCargaProducto() {
        Assert.assertTrue(productScreen.isProductBackpackDisplayed());

    }

    public void agregarUnidades(int unidades) {
        if (unidades > 1) {
            for (int i = 1; i < unidades; i++) {
                productScreen.clickMas();
            }

        }
        productScreen.clickAgregarCarrito();
    }

    public void validoCarrito(String unidades,String productos) {
        productScreen.clickCarrito();
        Assert.assertEquals(productos,productScreen.lblproductoEnCarrito());
        Assert.assertEquals(unidades,productScreen.lblUnidades());


    }
}
