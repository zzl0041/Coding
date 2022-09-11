package Walmart;

public class R1 {
    //arr[] = {4,5,6,7,8,9}
    //int n = 4
    //arr[] = {6,7,8,9,4,5}
    static int[] arrRotate(int[] arr, int n ){
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
            res[(i+n)%arr.length] = arr[i];
        return res;
    }
}
