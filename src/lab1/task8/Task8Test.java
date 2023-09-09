package lab1.task8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    void testSameLength(){
        Task8 t = new Task8();
        int[] nums1 = new int[] {1, 3, 5};
        int[] nums2 = new int[] {2, 4, 6};


        int[] actual = t.placesToMerge(nums1, nums2);
        int[] expected = new int[] {1, 2, 3};

        assertArrayEquals(expected, actual);
    }


    @Test
    void testZeroLengthSecondArray(){
        Task8 t = new Task8();
        int[] nums1 = new int[] {1, 3, 5};
        int[] nums2 = new int[] {};


        int[] actual = t.placesToMerge(nums1, nums2);
        int[] expected = new int[] {};

        assertArrayEquals(expected, actual);
    }
    @Test
    void testZeroLengthFirstArray(){
        Task8 t = new Task8();
        int[] nums1 = new int[] {};
        int[] nums2 = new int[] {1, 2, 3};


        int[] actual = t.placesToMerge(nums1, nums2);
        int[] expected = new int[] {0, 0, 0};

        assertArrayEquals(expected, actual);
    }


    @Test
    void testDifferentLength(){
        Task8 t = new Task8();
        int[] nums1 = new int[] {1, 3, 5};
        int[] nums2 = new int[] {2, 4, 6, 7, 8, 9};


        int[] actual = t.placesToMerge(nums1, nums2);
        int[] expected = new int[] {1, 2, 3, 3, 3, 3};

        assertArrayEquals(expected, actual);
    }


    @Test
    void testNotRisingSequence(){
        Task8 t = new Task8();
        int[] nums1 = new int[] {1, 3, 5};
        int[] nums2 = new int[] {2, 2, 2, 2};


        int[] actual = t.placesToMerge(nums1, nums2);
        int[] expected = new int[] {1, 1, 1, 1};

        assertArrayEquals(expected, actual);
    }

}