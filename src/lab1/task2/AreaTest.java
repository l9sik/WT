package lab1.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaTest {

    Area shape;

    @BeforeEach
    void createTestArea() throws Exception {
        shape = new Area(-4, 5, 4, 5, 4, 0, 6, 0, 6, -3, -6, -3, -6, 0, -4, 0);
    }

    @Test
    public void outOfShapeTest(){
        Point p = new Point(-10, -10);
        assertFalse(shape.isPointInArea(p));
    }
    @Test
    public void inShapeTest(){
        Point p = new Point(0, 0);
        assertTrue(shape.isPointInArea(p));
    }
    @Test
    public void onLineTest(){
        Point p = new Point(6, -1);
        assertTrue(shape.isPointInArea(p));
    }

    @Test
    public void inCornerTest(){
        Point p = new Point(4, 0);
        assertFalse(shape.isPointInArea(p));
    }
}