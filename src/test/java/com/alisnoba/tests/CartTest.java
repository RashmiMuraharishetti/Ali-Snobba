package com.alisnoba.tests;

import com.alisnoba.alisnoba.Cart;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CartTest {

    @Test
    public void TestInitialCartEmpty() {
        // Setup
        Cart cart = new Cart();
        int expected = 0;

        // Exercise
        int actual = cart.getProducts().size();

        // Assert
        assertEquals("As a customer, if I haven’t put anything into my cart, the cart is empty.", 0, actual);
    }


}
