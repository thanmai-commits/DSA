package Miscelleneous;

public class MissingNumber {
    public static void swap(int [] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int cyclicSort(int [] arr){
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i];
            if(correctIndex < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else i++;
        }
        for(int j = 0;j < arr.length;j++){
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int [] nums = {9,6,4,2,3,5,7,0,1};
        int ans = cyclicSort(nums);
        System.out.println(ans);
    }
}
