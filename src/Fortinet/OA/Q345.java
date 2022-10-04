package Fortinet.OA;

public class Q345 {
    /**
     * Consider a linked list of n elements. What is the time taken to insert an element after element pointed by same pointer ?
     * O(1)
     */


    /**
     * Answer :  (1) Arrays in java are essentially objects.
     *
     * Concept : Arrays in Java
     *
     * Given : (1)Arrays in java are essentially objects.
     *
     *             (2) It is not possible to assign one array to another. An individual
     *
     *                  elements of array can however be assigned.
     *
     *             (3) Array elements are indexed from 1 to size of array.
     *
     *             (4) If a method tries to access an array element beyond its range,
     *
     *                 a compile warning is generated​
     *
     * To Find : Which of the following statements are true ?
     *
     * Explanation :
     *
     * Arrays in java are essentially objects. These contains elements of similar data type and the elements in an array are stored in contiguous memory location. Hence, option (1) is the correct statement.
     *
     * In Java, one array can be assigned to another array. Individual elements of an array can also be assigned. Hence, option (2) is incorrect.
     *
     * Array elements in Java are indexed from 0 to the ( length of array - 1). Array index does not start from 1 in Java. Hence, option (3) is also incorrect.
     *
     * If a method tries to access an element in array beyond its range, it does not give a compilation error or it does not generate a compile warning. Hence, option (4) is also incorrect.
     */


    /**
     *

     What is the number of binary trees with 3 nodes which when traversed in postorder give the sequence A,B,C?

     Now 3 being small number I was quick to draw all possible binary trees and come at the conclusion that there can be 5 such binary trees for given postorder.

     C        C      C     C       C
     / \      /      /       \       \
     A   B    B      B         B       B
     /        \       /         \
     A          A     A           A

     Then I tried to do the same for 4 nodes postorder traversal A,B,C,D. We will need D at the root. Then all A,B,C can be in the right subtree of left subtree. So there will be 2×5 such formations. Let us denote this as follows:

     1root:3#nodes in left subtree:0#nodes in right subtree=5#tree arrangements

     1:0:3=5

     Now there is another possibility that 2 nodes are in the left subtree and the 3rd one in the right subtree or vice versa. Then,

     1:2:1=2

     1:1:2=2

     Total =14

     For 5 nodes postorder traversal A,B,C,D,E, I can get

     1:4:0=14

     1:0:4=14

     1:3:1=5

     1:1:3=5

     1:2:2=4

     Total =42
     */
}
