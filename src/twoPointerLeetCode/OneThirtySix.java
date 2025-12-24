package twoPointerLeetCode;

public class OneThirtySix {
    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        int ans = singleNumber(nums);
        System.out.println(ans);
    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
//        int anchor = 0;
//        int ans = nums[anchor];
//        for(int explorer = 1; explorer < nums.length; explorer++){
//            if(nums[anchor] != nums[explorer]){
//                ans = nums[anchor];
//            }
//            else{
//                anchor = explorer;
//            }
//        }
//        return ans;
    }
}
