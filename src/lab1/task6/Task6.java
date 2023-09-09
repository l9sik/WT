package lab1.task6;

import lab1.task5.Task5;

public class Task6 {

    int[][] generateMatrix(int[] nums){
        int[][] matrix = new int[nums.length][nums.length];


        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                matrix[i][j] = nums[(i + j) % nums.length];
            }
        }

        return matrix;
    }

}
