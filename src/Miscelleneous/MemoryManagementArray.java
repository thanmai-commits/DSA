package Miscelleneous;

import java.util.Arrays;

public class MemoryManagementArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        String a1 = "Bittu";
        String a2 = "Bittu";
        //". equals method checks the value"
        System.out.println(a1.equals(a2));
        //"==" checks if the variables are poinitng to same object
        System.out.println(a1 == a2);
//        System.out.println("=====Changing element with arr2=====");
//        arr2[0] = 999;
//        System.out.println("Checking if arr1 changes too");
//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));

    }
}
