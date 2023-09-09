package lab1.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    void zeroLengthTest(){
        int[] arr = new int[0];
        Task6 t = new Task6();
        int[][] actual = t.generateMatrix(arr);
        int[][] expected = new int[0][0];

        assertArrayEquals(actual, expected);
    }


    @Test
    void randomInputTest(){
        int[] arr = new int[] {1, 2, 3};
        Task6 t = new Task6();
        int[][] actual = t.generateMatrix(arr);
        int[][] expected = new int[][] {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};

        assertArrayEquals(actual, expected);
    }

}