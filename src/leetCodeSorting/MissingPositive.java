package leetCodeSorting;

import java.util.Arrays;
//41 LeetCode
public class MissingPositive {
    public static void swap(int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int firstMissingPositive(int[] nums){
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if(correctIndex >= 0 && correctIndex < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else i++;
        }
        for(int j = 0;  j < nums.length;j++){
            if(nums[j] != j + 1){
                return j + 1;
            }
        }
        return nums.length + 1;
    }

    public static void main(String[] args) {
        int [] arr = {1};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }
}
