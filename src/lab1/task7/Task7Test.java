package lab1.task7;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    @RepeatedTest(10)
    void randomValuesTest() {
        Task7 t = new Task7();
        Random r = new Random();
        int[] nums1 = new int[100];
        for (int i = 0; i < 100; i++){
            nums1[i] = r.nextInt();
        }
        int[] nums2 = nums1.clone();

        t.gnomeSort(nums1);
        Arrays.sort(nums2);

        assertArrayEquals(nums1, nums2);
    }

}