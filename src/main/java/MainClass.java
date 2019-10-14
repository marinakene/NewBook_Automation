//package org.openqa.selenium.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Panar\\IdeaProjects\\NewBook\\drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get("https://raamatukogu.herokuapp.com/catalog");
       // driver.navigate().to("https://raamatukogu.herokuapp.com/catalog/books");
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();

        WebElement partialLink = driver.findElement(By.partialLinkText("Create new book"));
       // WebElement cssLocator = driver.findElement(By.cssSelector("body > div > div > div.col-sm-2 > ul > li:nth-child(9) > a"));
        WebElement xpath1 = driver.findElement(By.xpath("/html/body/div/div/div[1]/ul/li[9]/a"));

        xpath1.click();

        WebElement title = driver.findElement(By.xpath("//*[@id='title']"));
        WebElement author = driver.findElement(By.xpath("//*[@id='author']"));
        WebElement summary = driver.findElement(By.xpath("//*[@id='summary']"));
        WebElement isbn_code = driver.findElement(By.xpath("//*[@id='isbn']"));
        WebElement fiction_checkbox = driver.findElement(By.xpath("//*[@id='5b6714c93809970014e31c9a']"));
        WebElement submit = driver.findElement(By.xpath("/html/body/div/div/div[2]/form/button"));

        title.sendKeys("Fiction book ever");
        author.click();
        driver.findElement(By.xpath("//*[@id='author']/option[15]")).click();  //choose author Mari Kene
        summary.sendKeys("The worst book you ever read");
        isbn_code.sendKeys("XBV123456");
        fiction_checkbox.click();
        System.out.println(fiction_checkbox.isSelected());  //Fiction is selected
        submit.click();

        // delete created book /html/body/div/div/div[2]/p[5]/a
       // /html/body/div/div/div[2]/li[101]/a



        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
