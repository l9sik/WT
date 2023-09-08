package lab1.task5;

public class Task5 {

    public static void main(String[] args) {
        Task5 t = new Task5();
        int[] arr = new int[] {1, 3, 4, 2, 3, 5, 6};
        int longestIncreasingSubsequenceLength = t.longestIncreasingSubsequenceLength(arr);
        System.out.println("You can remove " + (arr.length - longestIncreasingSubsequenceLength) + " elements.");
    }

    public int longestIncreasingSubsequenceLength(int[] arr){

        int[] d = new int[arr.length + 1];
        for(int i = 1; i < d.length; i++){
            d[i] = Integer.MAX_VALUE;
        }
        d[0] = Integer.MIN_VALUE;

        int length = 0;
        for (int i = 0; i < arr.length; i++){
            int j = binarySearch(d, arr[i], length);
            if ((d[j - 1] < arr[i]) && (d[j] > arr[i])){
                d[j] = arr[i];
                length = Math.max(j, length);
            }
        }

        return length;
    }

    public static int binarySearch(int[] arr, int target, int length) {
        int left = 0;
        //int right = (++length < arr.length)? length : arr.length - 1;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        // If the target element is not found, left points to the position where it should be inserted.
        return right + 1;
    }



}
