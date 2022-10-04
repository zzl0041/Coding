package Fortinet.OA;

public class Q1 {

    public static String dnaComplement(String s) {
        String res = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='A') res = 'T' + res;
            if(ch=='T') res = 'A' + res;
            if(ch=='C') res = 'G' + res;
            if(ch=='G') res = 'C' + res;
        }
        return res;
    }
}
