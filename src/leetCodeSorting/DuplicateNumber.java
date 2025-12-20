package leetCodeSorting;

public class DuplicateNumber {
    public static void swap(int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correctIndex = nums[i];
            if (nums[i] != nums[correctIndex]){
                swap(nums,i,correctIndex);
            }
            else i++;
        }
        for(int j = 0; j < nums.length;j++){
            if(nums[j] != j){
                return nums[j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {3,3,3,3,3};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
}
