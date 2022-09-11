package Kforce;
//Given a positive integer number n, your task is to calculate the difference between the product of its digits and the sum of its digits.
//
//        Note: The order matters; the answer should be of the form product - sum (and not sum - product).
//
//        Example
//
//        For n = 123456, the output should be solution(n) = 699.
//
//        The product of the digits is equal to 1 * 2 * 3 * 4 * 5 * 6 = 720.
//        The sum of the digits is equal to 1 + 2 + 3 + 4 + 5 + 6 = 21.
//        So the final answer is 720 - 21 = 699.
//
//        For n = 1010, the output should be solution(n) = -2.
//
//        The multiplication of the digits is equal to 1 * 0 * 1 * 0 = 0.
//        The sum of the digits is equal to 1 + 0 + 1 + 0 = 2.
//        So the final answer is 0 - 2 = -2.
//
//        Input/Output
//
//        [execution time limit] 3 seconds (java)
//
//        [input] integer n
//
//        A positive integer.
//
//        Guaranteed constraints:
//        1 ≤ n ≤ 109.
//
//        [output] integer
//
//        The difference between the product of n's digits and the sum of n's digits.
public class Q1 {
    int solution(int n) {
        int prod = 1;
        int sum = 0;
        for(int num:Integer.toString(n).chars().map(c->c-'0').toArray()){
            prod*=num;
            sum+=num;
        }
        return prod-sum;
    }
}
