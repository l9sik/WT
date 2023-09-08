package lab1.task3;

import lab1.task2.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;



class Task3Test {

    @Test
    void zeroStepTest(){

        Task3 t = new Task3();
        List<Point> resultPoints = t.tg(0, 10, 0);
        assertNull(resultPoints);
    }

    @Test
    void zeroGapTest(){
        Task3 t = new Task3();
        List<Point> resultPoints = t.tg(0, 0, 1);
        List<Point> expected = new ArrayList<>();
        assertResultsAreClose(expected, resultPoints);
    }


    private void assertResultsAreClose(List<Point> expected, List<Point> actual) {
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }
}