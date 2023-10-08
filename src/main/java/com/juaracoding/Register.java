package com.juaracoding;

import org.openqa.selenium.WebDriver;

public class Register {
    // add object driver
    private Driver driver;

    // inisialisasi variable untuk id pada form registrasi
    public String elementUsername = "emailControl";
    public String elementPassword = "passwordControl";
    public String elementRepassword = "repeatPasswordControl";
    public String elementAnswer = "securityAnswerControl";

    public Register(WebDriver driver){
        this.driver = new Driver(driver);

    }
    public void getRegis(String url, String email, String pass, String answer){
        // akses url
        driver.getUrl(url);

        // delay 3 detik untuk menunggu pop up dialog
        driver.delay(3);


        // verification for pop up
        if (driver.findCode("app-welcome-banner")){
            driver.closePopUp();
        }

        // mengisi form registrasi
        driver.sendId(elementUsername,email);
        driver.sendId(elementPassword,pass);
        driver.sendId(elementRepassword,pass);
        driver.clickXpath("//*[@id=\"registration-form\"]/div[1]/mat-form-field[1]/div/div[1]/div[3]");
        driver.clickId("mat-option-11");
        driver.sendId(elementAnswer, answer);
        driver.clickId("registerButton");
        driver.delay(5);

        // get url baru
        String newUrl = driver.getCurrentLink();

        if (newUrl.equals(url)){
            System.out.println("Registrasi Gagal");
            //driver.quit();
        } else {
            System.out.println("Registrasi Berhasil! Silahkan login");
        }
    }
}
