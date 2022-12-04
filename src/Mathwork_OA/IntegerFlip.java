package Mathwork_OA;

import java.util.HashMap;

public class IntegerFlip {
    /*
    https://leetcode.com/problems/fraction-to-recurring-decimal/solutions/127821/fraction-to-recurring-decimal/
    https://www.geeksforgeeks.org/find-recurring-sequence-fraction/
     */
    public static void flip(int N){
        String res = "";

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.clear();
        int rem = 1 % N;
        while((rem != 0) && (!mp.containsKey(rem))){
            mp.put(rem, res.length());
            rem = rem * 10;
            int res_part = rem / N;
            res += String.valueOf(res_part);
            rem = rem % N;

        }
        if(rem == 0) System.out.println(Double.valueOf(1)/Double.valueOf(N)+"0 0");
        else if(mp.containsKey(rem)){
            Double result = Double.valueOf(1)/Double.valueOf(N);
            String ans = result.toString();
            System.out.println(ans.substring(0, ans.indexOf(res.substring(mp.get(rem)))+1)+" "+
                    res.substring(mp.get(rem)));
        }

    }
    public static void main(String[] args) {
        flip(9);
    }
}
