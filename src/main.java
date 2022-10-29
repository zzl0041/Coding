import AmazonOA.BuildingsWithWifi;
import Fortinet.OA.Q678;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        main m = new main(new int[]{1,2,3});
        System.out.println(m.pickIndex());
        System.out.println('c'-'a');
    }
    private int[] prefix = null;
    private Random rand = null;

    public main(int[] w) {
        rand = new Random();
        prefix = new int[w.length];
        prefix[0] = w[0];
        for(int i = 1; i < w.length; i++){
            prefix[i] = w[i] + prefix[i-1];
        }
    }

    public int pickIndex() {
        int target = rand.nextInt(prefix[prefix.length-1]) + 1;
        System.out.println(target);
        for(int num : prefix) System.out.println(num);
        int left = 0, right = prefix.length - 1;
        while(left+1<right){
            int mid = (left + right) / 2;
            if(prefix[mid] < target){
                left = mid;
            }else{
                right = mid;
            }
        }
        if(target<=prefix[left]) return left;
        if(target<=prefix[right]) return right;
        return right + 1;
    }
}

