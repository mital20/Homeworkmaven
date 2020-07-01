package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DigitalStorm
{
    static WebDriver driver ;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://demo.nopcommerce.com");

        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li/a[@href=\"/computers\"]")).click();

        driver.findElement(By.xpath("//ul[@class=\"sublist\"]/li[1]/a[1]")).click();

        driver.findElement(By.xpath("//h2/a[text()=\"Digital Storm VANQUISH 3 Custom Performance PC\"]")).click();

        driver.findElement(By.xpath("//div/input[@value=\"Email a friend\"]")).click();

        driver.findElement(By.name("send-email")).click();

        String pagetext = driver.findElement(By.id("FriendEmail-error")).getText();
        System.out.println(pagetext);

        String text= driver.findElement(By.id("YourEmailAddress-error")).getText();
        System.out.println(text);


    }
}
