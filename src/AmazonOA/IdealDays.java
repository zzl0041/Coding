package AmazonOA;

import java.util.ArrayList;
import java.util.List;

public class IdealDays {

    // T = O(n) | S = O(n)
    // Where n is input array's length.
    public static List<Integer> solve(int[] rainFallPredictions, int k) {
        int[] forward = new int[rainFallPredictions.length];
        for (int i = 1; i < rainFallPredictions.length; ++i) {
            if (rainFallPredictions[i - 1] >= rainFallPredictions[i]) {
                forward[i] = forward[i - 1] + 1;
            }
        }

        int[] backward = new int[rainFallPredictions.length];
        for (int i = rainFallPredictions.length - 2; i >= 0; --i) {
            if (rainFallPredictions[i + 1] >= rainFallPredictions[i]) {
                backward[i] = backward[i + 1] + 1;
            }
        }

        List<Integer> idealDays = new ArrayList<>();
        for (int i = 0; i < rainFallPredictions.length; ++i) {
            if (forward[i] >= k && backward[i] >= k) {
                idealDays.add(i + 1);
            }
        }

        return idealDays;
    }
}