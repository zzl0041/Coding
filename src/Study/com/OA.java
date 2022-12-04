package Study.com;

import java.util.HashMap;
import java.util.Map;

public class OA {
    public static class MyClass {
        static int i = 0;
        private Map<String, Integer> map;

        public MyClass() {
            map = new HashMap<>();
            map.put("foo", 1);
            map.put("bar", 3);
        }

        public int getValue(String input, int numRetries) throws Exception {
            System.out.println(++i);
            try {
                return map.get(input);
            }
            catch (Exception e) {
                if (numRetries > 3) {
                    throw e;
                }
                return getValue(input, numRetries + 1);
            }
        }
    }
    /*
    Question: How many times will 'getValue(…)' execute in the following cases, and what will be the result of each?

  (1) getValue("foo", 0);
  (2) getValue("bar", 2);
  (3) getValue("baz", 0);
  (4) getValue("fubar", 1);
     */
    public static void main(String[] args) {
        MyClass test = new MyClass();
//        try {
//            System.out.println(test.getValue("foo", 0));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try {
            System.out.println(test.getValue("bar", 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
//        try {
//            System.out.println(test.getValue("baz", 0));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            test.getValue("fubar", 1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
