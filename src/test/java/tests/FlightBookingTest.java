package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ConfirmationPage;
import pages.FlightResultPage;
import pages.HomePage;
import pages.PurchasePage;

public class FlightBookingTest extends BaseTest {

    @Test
    public void bookFlightTest() {

        HomePage home = new HomePage(driver);
        home.selectDepartureCity("Boston");
        home.selectDestinationCity("London");
        home.clickFindFlights();

        FlightResultPage results = new FlightResultPage(driver);
        results.selectFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterPassengerDetails();
        purchase.purchaseFlight();

        ConfirmationPage confirm = new ConfirmationPage(driver);
        String message = confirm.getConfirmationMessage();
        Assert.assertTrue(message.contains("Thank you for your purchase today!"),"Booking Failed");
    }
}