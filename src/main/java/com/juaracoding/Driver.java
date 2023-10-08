package com.juaracoding;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Driver {
    private WebDriver driver;
    public Driver(WebDriver driver){
        setDriver(driver);
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void getUrl(String url){
        this.driver.get(url);
        this.driver.manage().window().maximize();
        System.out.println("Open Url : " + url);
    }

    public void clickId(String id){
        this.driver.findElement(By.id(id)).click();
    }

    public void clickXpath(String xpath){
        this.driver.findElement(By.xpath(xpath)).click();
    }

    public void clickName(String name){
        this.driver.findElement(By.name(name)).click();
    }

    public void sendName(String name, String keys){
        this.driver.findElement(By.name(name)).sendKeys(keys);
    }

    public void switchToDismiss(){
        this.driver.switchTo().alert().dismiss();
    }

    public void sendId(String id, String keys){
        this.driver.findElement(By.id(id)).sendKeys(keys);
    }

    public void selectByXpath(String xpath, String keys){
        Select item = new Select(this.driver.findElement(By.xpath(xpath)));
        item.selectByValue(keys);
    }

    public boolean findCode(String code){

//        String text = driver.findElement(By.xpath(xpath)).getText();
//        System.out.println(text);
        String text = driver.getPageSource();
//        System.out.println(text);

        if (text.contains(code)) {
            return true;
        } else {
            return false;
        }

    }

    public void scriptingId(String id){
        String txt = this.driver.findElement(By.id(id)).getText();
        System.out.println(txt);
    }

    public void delay(long detik){
        try{
            Thread.sleep(detik * 1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public void closePopUp(){
        clickXpath("//*[@id=\"mat-dialog-0\"]/app-welcome-banner/div/div[2]/button[2]");
    }

    public void quit(){
        this.driver.quit();
    }

    public String getCurrentLink(){
        return this.driver.getCurrentUrl();
    }

}
