package leetCodeSorting;

import java.util.ArrayList;
import java.util.List;

public class DuplicateInArray {
    public static void swap(int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    // 442 LeetCode
    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]){
               swap(nums, i, correctIndex);
            }
            else i++;
        }
        List<Integer> duplicates = new ArrayList<Integer>();
        for(int j = 0; j < nums.length;j++){
            if(nums[j] != j + 1){
                duplicates.add(nums[j]);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        int [] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans =  findDuplicates(nums);
        System.out.println(ans);
    }
}
