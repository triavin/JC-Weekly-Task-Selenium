package com.juaracoding;

import org.openqa.selenium.WebDriver;

public class Login{
    private Driver driver;
    public String elementEmail = "email";
    public String elementPass = "password";
    public String elementButton = "loginButton";

    public Login(WebDriver driver){
        this.driver = new Driver(driver);

    }
    public void loginUser(String url, String email, String pass){
        driver.delay(2);
        if (driver.getCurrentLink().equals(url)){
            System.out.println("Url Already Open ! ");
        } else {
            driver.getUrl(url);
        }

        driver.delay(2);

        // verification for pop up
        if (driver.findCode("app-welcome-banner")){
            driver.closePopUp();
        }

        driver.sendId(elementEmail, email);
        driver.sendId(elementPass, pass);
        driver.delay(1);
        driver.clickId(elementButton);
        driver.delay(2);

        if (driver.getCurrentLink().equals(url)){
            System.out.println("login Gagal !");
            //driver.quit();
        } else {
            System.out.println("login Berhasil !");
        }

    }
}
