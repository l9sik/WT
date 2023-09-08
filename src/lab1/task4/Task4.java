package lab1.task4;

import lab1.task1.Task1;

import java.util.Arrays;
import java.util.function.IntPredicate;

import static java.util.Arrays.stream;

public class Task4 {

    public static void main(String[] args) {
        Task4 t = new Task4();
        int[] arr = new int[] {1, 2 ,3 ,4 ,5 ,6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(t.getPrimeIndexes(arr)));
    }

    public int[] getPrimeIndexes(int[] nums){

        int[] primeIndexes = new int[nums.length];
        primeIndexes = stream(primeIndexes).map((i) -> -1).toArray();


        int j = 0;
        for (int i = 0; i < nums.length; i++){
            if (isPrime(nums[i])){
                primeIndexes[j] = i;
                j++;
            }
        }

        return stream(primeIndexes).filter(value -> value != -1 ).toArray();
    }

    // Function to check if a given number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

}
