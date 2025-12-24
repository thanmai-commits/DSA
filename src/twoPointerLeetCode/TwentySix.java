package twoPointerLeetCode;

public class TwentySix {
    public static int removeDuplicates(int[] nums) {
        int anchor = 0;
        int explorer = 1;
        while(explorer <  nums.length){
            if(nums[anchor] != nums[explorer]){
                anchor++;
                nums[anchor] = nums[explorer];
                explorer ++;
            }
            else{
                explorer++;
            }
        }
        return anchor + 1;

    }
}
