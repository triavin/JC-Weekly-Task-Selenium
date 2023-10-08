package com.juaracoding;

public class MainApp {

    public static void main(String[] args) {
        String path = "C:\\Users\\Aldi Triavin\\Documents\\Juara Coding\\Tools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        Register regis = new Register();
        String url = "https://juice-shop.herokuapp.com/#/register";
        String email = "aldi2@gmai.com";
        String pass = "Dre1Sd!";
        String answer = "Regular Show";
        regis.getRegis(url, email , pass, answer);

    }
}
