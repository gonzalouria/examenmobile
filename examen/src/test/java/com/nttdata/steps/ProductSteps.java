package com.nttdata.steps;

import com.nttdata.screens.ProductScreen;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class ProductSteps {

    ProductScreen productScreen;

    public void verificarCarga() {

    Assert.assertTrue(productScreen.isProductDisplayed());
    productScreen.clickOnProduct();

    }
}
