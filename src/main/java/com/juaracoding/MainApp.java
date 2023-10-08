package com.juaracoding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainApp {

    public static void main(String[] args) {
        // inisialisasi web driver
        String path = "C:\\Users\\Aldi Triavin\\Documents\\Juara Coding\\Tools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();

        // add object
        Register regis = new Register(driver);
        Login login =  new Login(driver);
        AddCart addCart = new AddCart(driver);


        // inisialisasi variable
        String urlRegis = "https://juice-shop.herokuapp.com/#/register";
        String urlLogin = "https://juice-shop.herokuapp.com/#/login";
        String urlSearch = "https://juice-shop.herokuapp.com/#/search?q=";
        String email = "aldi2@gmai.com";
        String pass = "Dre1Sd!";
        String answer = "Regular Show";
        String product = "Juice Shop \"Permafrost\" 2020 Edition";

        // regis user
        regis.getRegis(urlRegis, email , pass, answer);
        // login user
        login.loginUser(urlLogin, email, pass);
        // add product to cart
        addCart.addProduct(urlSearch, product);


    }
}
