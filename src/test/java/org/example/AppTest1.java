package org.example;

import org.testng.annotations.Test;

@Test
public class AppTest1
{
    @Test(priority = 1)
    void openFlipkart()
    {
        System.out.println("Opening the Flipkart");
    }
    @Test(priority = 2)
    void searchShirts()
    {
        System.out.println("Searching for Shirts");
    }
    @Test(priority = 3)
    void addToCart()
    {
        System.out.println("Adding Shirts in to Cart");
    }
}
