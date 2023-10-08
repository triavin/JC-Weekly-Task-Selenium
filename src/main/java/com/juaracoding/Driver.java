package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    public String path = "C:\\Users\\Aldi Triavin\\Documents\\Juara Coding\\Tools\\chromedriver.exe";
    public void getUrl(String url){
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        System.out.println("Open Url : " + url);
    }

    public void clickId(String id){
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.id(id)).click();
    }
    public void clickXpath(String xpath){
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.id(xpath)).click();
    }
    public void sendName(String name, String keys){
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.name(name)).sendKeys(keys);
    }

    public void switchToDesmiss(){
//        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.switchTo().alert().dismiss();
    }

    public void sendId(String id, String keys){
//        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        driver.findElement(By.id(id)).sendKeys(keys);
    }

    public void scriptingId(String id){
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver = new ChromeDriver();
        String txt = driver.findElement(By.id(id)).getText();
        System.out.println(txt);
    }

    public void delay(long detik){
        try{

            Thread.sleep(detik * 1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }


}
