package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Electronics
{
    static WebDriver driver;

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver.exe" );
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://demo.nopcommerce.com");

        driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a")).click();

        driver.findElement(By.xpath("//li[@class=\"active last\"]/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        driver.findElement(By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();


//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

            driver.findElement(By.xpath("//li[@id=\"topcartlink\"]/a/span[1]")).click();


        String pagetext = driver.findElement(By.xpath("//tr/td[4]/a[text()=\"HTC One M8 Android L 5.0 Lollipop\"]")).getText();
        System.out.println(pagetext);

        String text = driver.findElement(By.xpath("//tr/td[4]/a[text()=\"HTC One Mini Blue\"]")).getText();
        System.out.println(text);




    }
}
