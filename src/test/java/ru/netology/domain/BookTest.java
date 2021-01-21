package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    Book book = new Book(2,"jumanji",500,"Van Allsburg");
    @Test
    public void shouldCorrectName(){
        boolean actual = book.matches("jumanji");
        assertEquals(true,actual);
    }
    @Test
    public void shouldInCorrectName(){
        boolean actual = book.matches("Lord of the rings");
        assertEquals(false,actual);
    }@Test
    public void shouldCorrectAuthor(){
        boolean actual = book.matches("Van Allsburg");
        assertEquals(true,actual);
    }
    @Test
    public void shouldInCorrectAuthor(){
        boolean actual = book.matches("Van Hellsing");
        assertEquals(false,actual);
    }


}
