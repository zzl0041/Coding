package Walmart;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class R2 {
    static HashMap map = new HashMap();

    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    static Thread t1 = new Thread(()->map.put(1,'A'));
    static Thread t2 = new Thread(()->map.put(1,'B'));


    static void mapTest(){
        t1.run();
        t2.run();
    }
    //Leetcode 166
    static String calculator(double numerator, double denominator){
        double res = numerator/denominator;
        String fraction = String.valueOf(res).split(".")[1];
        for(char c : fraction.toCharArray()){
            StringBuilder sb = new StringBuilder();
            char first;
//            if(sb.toString()==)
        }
        return String.valueOf(res);
    }
}
