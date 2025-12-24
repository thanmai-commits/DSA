package twoPointerLeetCode;

import java.util.Arrays;

public class TwoEightyThree {
    public static void main(String[] args) {
        int [] arr = {0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeroes(int[] nums) {
        int anchor = 0;
        for(int explorer = 0; explorer < nums.length; explorer++){
            if (nums[explorer] != 0){
                nums[anchor] = nums[explorer];
                anchor++;
            }
        }
        for(int i = anchor; i < nums.length; i++){
            nums[i] = 0;
        }

    }
}
