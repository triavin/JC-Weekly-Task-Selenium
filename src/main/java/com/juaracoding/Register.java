package com.juaracoding;

public class Register {
    // add object driver
    Driver driver = new Driver();

    // inisialisasi variable untuk id pada form registrasi
    public String elementUsername = "emailControl";
    public String elementPassword = "passwordControl";
    public String elementRepassword = "repeatPasswordControl";
    public String elementAnswer = "securityAnswerControl";
    public void getRegis(String url, String email, String pass, String answer){
        // akses url
        driver.getUrl(url);

        // delay 3 detik untuk menunggu pop up dialog
        driver.delay(3);

        // menutup pop up dialog menggunakan click xpath
        driver.clickXpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]");

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
        String newUrl = driver.driver.getCurrentUrl();

        if (newUrl.equals(url)){
            System.out.println("Registrasi Gagal");
        } else {
            System.out.println("Registrasi Berhasil! Silahkan login");
        }
    }
}
