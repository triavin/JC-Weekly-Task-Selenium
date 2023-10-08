package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Driver {
    WebDriver driver = new ChromeDriver();
    public void getUrl(String url){
        driver.get(url);
        driver.manage().window().maximize();
        System.out.println("Open Url : " + url);
    }

    public void clickId(String id){
        driver.findElement(By.id(id)).click();
    }

    public void clickXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clickName(String name){
        driver.findElement(By.name(name)).click();
    }

    public void sendName(String name, String keys){
        driver.findElement(By.name(name)).sendKeys(keys);
    }

    public void switchToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void sendId(String id, String keys){
       driver.findElement(By.id(id)).sendKeys(keys);
    }

    public void selectByXpath(String xpath, String keys){
        Select item = new Select(driver.findElement(By.xpath(xpath)));
        item.selectByValue(keys);
    }
    public void scriptingId(String id){
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
