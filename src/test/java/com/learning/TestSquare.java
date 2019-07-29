package com.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSquare {

    @Test
    void shouldReturnTheSquare() {
        Square s = new Square();
        assertEquals(s.square(2), 4);
    }
}