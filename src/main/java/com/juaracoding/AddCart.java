package com.juaracoding;

import org.openqa.selenium.WebDriver;

public class AddCart {
    private Driver driver;

    public AddCart(WebDriver driver){
        this.driver = new Driver(driver);
    }
    public void addProduct(String url, String itemName){
        driver.delay(2);

        if (driver.getCurrentLink().equals(url+itemName)){
            System.out.println("Url Already Open ! ");
        } else {
            driver.getUrl(url+itemName);
        }

        // verification for pop up
        if (driver.findCode("app-welcome-banner")){
            driver.closePopUp();
        }

        // add product to cart
        driver.clickXpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-search-result/div/div/div[2]/mat-grid-list/div/mat-grid-tile/div/mat-card/div[3]/button");
        driver.delay(3);
        String text = driver.scriptingClass("mat-simple-snack-bar-content");
        System.out.println(text);

        if (text.equals("You can order only up to 1 items of this product.")){
            System.out.println("Product sudah ada dikeranjang !");
            // driver.clickXpath("/html/body/app-root/div/mat-sidenav-container/mat-sidenav-content/app-basket/mat-card/app-purchase-basket/mat-table/mat-row/mat-cell[5]/button");
            // driver.quit();
        } else {
            System.out.println("Product Berhasil ditambahkan !");
        }

        driver.getUrl("https://juice-shop.herokuapp.com/#/basket");

    }
}
