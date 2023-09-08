package lab1.task5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void regularValuesTest() {

        Task5 t = new Task5();
        int[] arr = new int[] {1, 3, 4, 2, 3, 5, 6};
        int longestIncreasingSubsequenceLength = t.longestIncreasingSubsequenceLength(arr);
        int canBeRemoved = arr.length - longestIncreasingSubsequenceLength;
        assertEquals(2, canBeRemoved);

    }
    @Test
    void allSameValuesTest(){

        Task5 t = new Task5();
        int[] arr = new int[] {10, 10, 10, 10, 10};
        int l = t.longestIncreasingSubsequenceLength(arr);
        int canRemove = arr.length - l;
        assertEquals(arr.length - 1, canRemove);
    }
    @Test
    void noElementsTest() {
        Task5 t = new Task5();
        int[] arr = new int[0];
        int l = t.longestIncreasingSubsequenceLength(arr);
        assertEquals(0, l);
    }
    @Test
    void noElementsToRemoveTest() {
        Task5 t = new Task5();
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int l = t.longestIncreasingSubsequenceLength(arr);
        assertEquals(arr.length, l);
    }
}