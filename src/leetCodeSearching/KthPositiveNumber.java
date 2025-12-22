package leetCodeSearching;

import java.util.ArrayList;
import java.util.List;

//1539 LeetCode
public class KthPositiveNumber {
    public static void main(String[] args) {
        int [] arr = {2,3,4,7,11};
        int missingAns = findKthPositive(arr, 5);
        System.out.println(missingAns);
    }
    public static int findKthPositive(int[] arr, int k) {
        int currentNumber = 1;
        int index = 0;

        while (k > 0) {
            // If currentNumber matches an element in the array, it's not missing
            if (index < arr.length && arr[index] == currentNumber) {
                index++;
            } else {
                // If it doesn't match, it's a missing number!
                k--;
                // If k reaches 0, the currentNumber is the kth missing
                if (k == 0) {
                    return currentNumber;
                }
            }
            currentNumber++;
        }
        return -1;
    }
}
