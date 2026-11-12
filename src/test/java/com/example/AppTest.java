package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();
        assertEquals(8, app.add(5, 3));
    }

    @Test
    public void testAdditionWithNegativeNumber() {
        App app = new App();
        assertEquals(2, app.add(5, -3));
    }
}
