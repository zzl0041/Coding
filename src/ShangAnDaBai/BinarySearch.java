package ShangAnDaBai;

public class BinarySearch {
    int bSearch(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        while(start + 1< end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target)
                start = mid;
            else
                end = mid;
        }
        if(arr[start] == target) return start;
        if(arr[end] == target) return end;
        return -1;
    }
}
