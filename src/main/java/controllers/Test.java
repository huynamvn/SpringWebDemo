package controllers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/tungtv202/Downloads/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://dantri.com.vn/");
        System.out.println(webDriver.getTitle());
    }
}
