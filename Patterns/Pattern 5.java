/*Problem statement
Sam is planting trees on the upper half region (separated by the left diagonal) of the square shared field.

For every value of ‘N’, print the field if the trees are represented by ‘*’.

Example:
Input: ‘N’ = 3

Output: 
* * *
* *
*
*/
public class Solution {
    public static void seeding(int n) {
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i+1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
