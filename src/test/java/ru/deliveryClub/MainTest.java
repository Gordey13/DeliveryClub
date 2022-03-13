package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;

public class MainTest extends WebDriverSettings{

    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club — Доставка еды и продуктов"));
    }



}
