package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightResultPage {

    WebDriver driver;

    public FlightResultPage(WebDriver driver) {
        this.driver = driver;
    }

    By chooseFlight = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public void selectFlight() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement flight = wait.until(ExpectedConditions.elementToBeClickable(chooseFlight));
        flight.click();
    }
}
