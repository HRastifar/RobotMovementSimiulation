package tests;

import main.robotsimiulation.Board;
import main.robotsimiulation.Robot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    Robot myRobot ;
    Board location ;

    @BeforeEach
    void initAll() {
        myRobot = new Robot("R2");
        location = new Board();
    }

    @Test
    void getNameTest() {
      String expected = "R2";
      String result = myRobot.getName();
      assertEquals(expected,result);
    }


    @Test
    void getDirectionTest() {
        char expected = 'N';
        char result = myRobot.getDirection();
        assertEquals(expected,result);
    }

        @Test
    void setDirectionTest() {
        char expected = 'W';
        myRobot.setDirection('W');
        char result = myRobot.getDirection();
        assertEquals(expected,result);
    }

    @Test
    void placeTest() {
        myRobot.place(6,6,'k');
        int expectedX = 0 ;
        int ecpectedY = 0;
        char expected = 'N';
        int resultX = location.getX();
        int resultY = location.getY();
        char result = myRobot.getDirection();
        assertEquals(expected,result);
        assertEquals(expectedX,resultX);
        assertEquals(ecpectedY,resultY);
    }

    @Test
    void MoveTest() {
        location.setX(4);
        location.setY(2);
        myRobot.setDirection('N');
        myRobot.move();
        int expectedX = 4 ;
        int ecpectedY = 2;
        char expected = 'N';
        int resultX = location.getX();
        int resultY = location.getY();
        char result = myRobot.getDirection();
        assertEquals(expected,result);
        assertEquals(expectedX,resultX);
        assertEquals(ecpectedY,resultY);
    }


    @Test
    void leftTest() {
        myRobot.setDirection('N');
        myRobot.left();
        char expected = 'W';
        char result = myRobot.getDirection();
        assertEquals(expected,result);

    }

    @Test
    void RightTest() {
        myRobot.setDirection('N');
        myRobot.right();
        char expected = 'E';
        char result = myRobot.getDirection();
        assertEquals(expected,result);

    }

    @Test
    void checkForDirectionTest() {

        boolean expected = false;
        boolean result = myRobot.checkForDirection('L');
        assertEquals(expected,result);

    }
}