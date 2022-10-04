package Fortinet.OA;

public class Q678 {
    /**
     * in many application like social media the app suggests the list of friends that a particular user may know, it may be used on a system that has over a billion users. which algorithm is best to implement this feature
     * Floyd Warshall Algorithm
     * Dijkstra's Algorithm
     * Bellman-Ford algorithm
     * Prim's Algorithm
     */

    int binarySearch(int arr[], int l, int r, int x){
        if(r >= l){
            int mid = l + (r - l) / 2;
            if(arr[mid] == x)
                return mid;
            if(arr[mid] > x)
                return binarySearch(arr, l, mid + 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    //There's an error in line 4/8/10/code is correct?

    /**
     * The string S is intially empty . the following can be performed on S any number of times.
     * 1.Append any character to S for a cost of 5 points.
     * 2. copy any substring of S that ends t the current rightmost charcter.
     * Append it to S for a cost of 5 points.what is the minimum cost to construct the string abhihibhihi
     *
     * A.35
     * B.30
     * C.25
     * D.20
     */

    // function to return the minimal number of moves
    static int minimalSteps(String s, int n)
//    Add any character at the end of the string.
//            or, append the string to the string itself.
    {

        int []dp = new int[n];

        // initializing dp[i] to INT_MAX
        for (int i = 0; i < n; i++)
            dp[i] = Integer.MAX_VALUE;

        // initialize both strings to null
        String s1 = "", s2 = "";

        // base case
        dp[0] = 1;

        s1 += s.charAt(0);

        for (int i = 1; i < n; i++)
        {
            s1 += s.charAt(i);

            // check if it can be appended
            s2 = s.substring(i + 1, i + 1);

            // addition of character takes one step
            dp[i] = Math.min(dp[i], dp[i - 1] + 1);

            // appending takes 1 step, and we directly
            // reach index i*2+1 after appending
            // so the number of steps is stord in i*2+1
            if (s1 == s2)
                dp[i * 2 + 1] = Math.min(dp[i] + 1,
                        dp[i * 2 + 1]);
        }
        return dp[n - 1];
    }
//    String s = "aaaaaaaa";
//    int n = s.length();

    // function call to return minimal number of moves
//    System.out.println(minimalSteps(s, n)/2);

    static int minCost(char[] s)
//    Appending a single character cost 1 unit
//    A sub-string of a new string(intermediate string) can be appended without any cost
    {

        // Initially all characters are un-seen
        boolean alphabets[] = new boolean[26];

        // Marking seen characters
        for (int i = 0; i < s.length; i++)
        {
            alphabets[(int) s[i] - 97] = true;
        }

        // Count total seen character,
        // and that is the cost
        int count = 0;
        for (int i = 0; i < 26; i++)
        {
            if (alphabets[i])
            {
                count++;
            }
        }

        return count;
    }
    // Driver code
    public static void main(String[] args)
    {
        // s is the string that needs to be constructed
        String s = "abhihibhihi";
        System.out.println("Total cost to construct " +
                s + " is " + minCost(s.toCharArray()));
    }
}
