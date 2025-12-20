package Miscelleneous;

import java.util.Arrays;

public class Practice {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int maxIndex(int [] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;

    }
    // Bubble sort practice
    public static void bubbleSort(int [] arr){
        boolean swapped = false;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    // Selection Sort
    public static void sort(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int lastIndex = arr.length - i - 1;
            int getMax = maxIndex(arr, 0, lastIndex);
            swap(arr, getMax, lastIndex);
        }

    }
    // Insertion Sort
    public static void insertionSort(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
            }
        }
    }
    // Cyclic Sort
    public static void cyclicSort(int [] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else i++;
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,1,4,3,2};
        int [] arr2 = {5,4,3,2,1};
        int [] arr3 = {};
        System.out.println("====Bubble Sort====");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("====Selection Sort====");
        sort(arr2);
        System.out.println(Arrays.toString(arr2));
        System.out.println("====Insertion Sort====");
        insertionSort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
