package searchAlgorithms;

public class LinearSearch {
    public static int search(int [] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6};
        int target = 6;
        int ans =  search(nums, target);
        System.out.println(ans);
    }
}
