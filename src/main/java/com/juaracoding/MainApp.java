package com.juaracoding;

public class MainApp {

    public static void main(String[] args) {
        String path = "C:\\Users\\Aldi Triavin\\Documents\\Juara Coding\\Tools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        Register regis = new Register();
        regis.getRegis("https://juice-shop.herokuapp.com/#/register", "aldi123@gmai.com", "Dre1Sd!", "Regular Show");

    }
}
