package twoPointerLeetCode;

public class TwentySeven {
    public static void main(String[] args) {
        int [] arr = {0,1,2,2,3,0,4,2};
        int ans = removeElement(arr, 2);
        System.out.println(ans);

    }
    public static int removeElement(int[] nums, int val) {
        int anchor = 0;
        for(int explorer = 0; explorer < nums.length; explorer++){
            if (nums[explorer] != val){
                nums[anchor] = nums[explorer];
                anchor++;
            }
        }
        return anchor;
    }
}
