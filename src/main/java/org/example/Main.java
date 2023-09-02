package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Usuario\\IdeaProjects\\automatizacion\\src\\main\\resources\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        String usuario ="standard_user";
        String contraseña = "secret_sauce";

        WebElement usuarioentrada = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement contraseñaentrada = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement btnlgn = driver.findElement(By.xpath("//input[@id='login-button']"));

        usuarioentrada.sendKeys((usuario));
        contraseñaentrada.sendKeys(contraseña);
        btnlgn.click();

        WebElement addElement1 = driver.findElement(By.xpath("//div[@class='inventory_list']/div[1]//button[@class='btn_primary btn_inventory']"));
        WebElement addElement2 = driver.findElement(By.xpath("//div[@class='inventory_list']/div[3]//button[@class='btn_primary btn_inventory']"));
        WebElement addElement3 = driver.findElement(By.xpath("//div[@class='inventory_list']/div[6]//button[@class='btn_primary btn_inventory']"));

        addElement1.click();
        addElement2.click();
        addElement3.click();

        WebElement irCarrito = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
        irCarrito.click();

        WebElement checkout = driver.findElement(By.xpath("//a[.='CHECKOUT']"));
        checkout.click();

        String name = "Juan";
        String lastname = "Calvo";
        String postal = "Zipaquira";

        WebElement insertname = driver.findElement(By.xpath("//input[@id='first-name']"));
        WebElement insertlastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        WebElement insertpostal = driver.findElement(By.xpath("//input[@id='postal-code']"));

        insertname.sendKeys(name);
        insertlastname.sendKeys(lastname);
        insertpostal.sendKeys(postal);

        WebElement btncontin = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));

        btncontin.click();

        WebElement btnfinish = driver.findElement(By.xpath("//a[.='FINISH']"));

        btnfinish.click();

        JavascriptExecutor scrool = (JavascriptExecutor) driver;
        scrool.executeAsyncScript("window.scrollTo(0, document.body.scrollHeight)");

    }
}