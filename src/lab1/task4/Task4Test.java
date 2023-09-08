package lab1.task4;

import lab1.task1.Task1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void emptyArrayTest() {
        int[] nums = new int[0];
        Task4 t = new Task4();
        assertArrayEquals(t.getPrimeIndexes(nums), new int[0]);
    }

    @Test
    void noPrimesArrayTest() {
        int[] nums = new int[] {4, 6, 8, 10};
        Task4 t = new Task4();
        assertArrayEquals(t.getPrimeIndexes(nums), new int[] {});

    }

}