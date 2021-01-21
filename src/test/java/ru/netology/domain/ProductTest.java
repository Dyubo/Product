package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {
    private Product product = new Product(5,"Xiaomi", 25000);
    @Test
    public void shouldCorrectName() {
        boolean actual = product.matches("Xiaomi");
        assertEquals(true, actual);
    }
        @Test
    public void shouldInCorrectName(){
        boolean actual = product.matches("Honor");
        assertEquals (false, actual);
    }
}
