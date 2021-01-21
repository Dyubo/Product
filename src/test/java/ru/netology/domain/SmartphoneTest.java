package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SmartphoneTest {
    Smartphone smartphone = new Smartphone(1,"Honor", 10000, "Chine");

    @Test
    public void shouldCorrectName(){
        boolean actual = smartphone.matches("Honor");
        assertEquals (true,actual);
    }@Test
    public void shouldInCorrectName(){
        boolean actual = smartphone.matches("Samsung");
        assertEquals (false,actual);
    }@Test
    public void shouldInCorrectManufacture(){
        boolean actual = smartphone.matches("Korea");
        assertEquals (false,actual);
    }@Test
    public void shouldCorrectManufacture(){
        boolean actual = smartphone.matches("Chine");
        assertEquals (true,actual);
    }
}
