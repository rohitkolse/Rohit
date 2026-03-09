package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By state = By.id("state");
    By zip = By.id("zipCode");
    By cardNumber = By.id("creditCardNumber");
    By purchaseBtn = By.xpath("//input[@value='Purchase Flight']");

    public void enterPassengerDetails() {

        driver.findElement(name).sendKeys("Rohit");
        driver.findElement(address).sendKeys("Pune");
        driver.findElement(city).sendKeys("Pune");
        driver.findElement(state).sendKeys("Maharashtra");
        driver.findElement(zip).sendKeys("411001");
        driver.findElement(cardNumber).sendKeys("1234567890123456");
    }

    public void purchaseFlight() {
        driver.findElement(purchaseBtn).click();
    }
}
