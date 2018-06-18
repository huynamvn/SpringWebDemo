package controllers;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;

/**
 * Created by nhs3108 on 6/2/17.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) throws  Exception{
        String pathS="/home/tran.van.tung/chromedriver";

        System.setProperty("webdriver.chrome.driver",pathS);
        System.out.println("STEP 1"+ pathS);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("window-size=1200x600");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://dantri.com.vn/");
        System.out.println("STEP 2");
        model.addAttribute("output", webDriver.getTitle());
        return    "selenium";
    }
}
