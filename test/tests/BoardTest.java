package tests;

import org.junit.jupiter.api.BeforeEach;
import main.robotsimiulation.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    Board location ;
    @BeforeEach
    void initAll() {
        location = new Board();
    }

    @Test
    void setXTest() {
        location.setX(2);
        int expected = 2;
        int result = location.getX();
        assertEquals(expected,result);
    }
    @Test
    void getXTest() {
        int expected = 0;
        int result = location.getX();
        assertEquals(expected,result);
    }

    @Test
    void setYTest() {
        location.setY(2);
        int expected = 2;
        int result = location.getY();
        assertEquals(expected,result);
    }
    @Test
    void getYTest() {
        int expected = 0;
        int result = location.getY();
        assertEquals(expected,result);
    }

    @Test
    void  incrementTest() {
        location.increment('x');
        int expected = 1;
        int result = location.getX();
        assertEquals(expected,result);
    }

    @Test
    void  decrementTest() {
        location.decrement('x');
        int expected = -1;
        int result = location.getX();
        assertEquals(expected,result);
    }

    @Test
    void  checkForBoundariesTest() {
        boolean expected =false;
        boolean result = location.checkForBoundaries(5,'x');
        assertEquals(expected,result);
    }






}