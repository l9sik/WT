package lab1.task8;

public class Task8 {

    int[] placesToMerge(int[] arr1, int[] arr2){
        int[] indexes = new int[arr2.length];

        for(int i = 0, j = 0; i < arr2.length; i++){
            boolean placeNotFound = true;
            while(placeNotFound)
                if((j >= arr1.length) || (arr1[j] >= arr2[i])){
                    placeNotFound = false;
                    indexes[i] = j;
                }else{
                    j++;
                }
        }

        return indexes;
    }
}
