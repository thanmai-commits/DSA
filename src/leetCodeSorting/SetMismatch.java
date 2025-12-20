package leetCodeSorting;

import java.util.Arrays;
// 645 LeetCode
public class SetMismatch {
    public static void swap(int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else i++;
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return new int[] {nums[j], j + 1};
            }
        }
        return new int []{-1,-1};
    }

    public static void main(String[] args) {
        int [] arr = {2,2};
        int [] ans = findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }
}
