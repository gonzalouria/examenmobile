package com.nttdata.screens;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement producto;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement productoMochila ;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement TShirt ;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement bikeLight ;


    @AndroidFindBy(uiAutomator =
            "new UiScrollable(new UiSelector().scrollable(true))" +
                    ".scrollIntoView(new UiSelector().description(\"Increase item quantity\"));")
    private WebElement botonAgregar ;



    @AndroidFindBy(uiAutomator =
            "new UiScrollable(new UiSelector().scrollable(true))" +
                    ".scrollIntoView(new UiSelector().text(\"Add to cart\"));")
    private WebElement botonAgregarCarrito ;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Displays number of items in your cart\"]")
    private WebElement botonCarrito;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/noTV\"]")
    private WebElement lblUnidades;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/titleTV\"]")
    private WebElement lblproductoEnCarrito;




    public void clickOnProduct() {
    productoMochila.click();

    }
    public void clickOnProduct2() {
        TShirt.click();

    }
    public void clickOnProduct3() {
        bikeLight.click();

    }

    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(producto));
        return producto.isEnabled();
    }


    public boolean isProductBackpackDisplayed() {
        waitFor(ExpectedConditions.visibilityOf(productoMochila));
        return productoMochila.isEnabled();
    }

    public void clickMas() {
        botonAgregar.click();
    }
    public void clickAgregarCarrito() {
        botonAgregarCarrito.click();
    }

    public void clickCarrito() {
        botonCarrito.click();

    }
    public String lblproductoEnCarrito() {
        return lblproductoEnCarrito.getText();
    }
    public String lblUnidades() {
        return lblUnidades.getText();
    }
}
