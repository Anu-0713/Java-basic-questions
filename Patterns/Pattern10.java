/*Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.

Example:
Input: ‘N’ = 3

Output: 

*
**
***
**
*
*/
public class Solution {
    public static void nStarTriangle(int n) {
        for(int i=0;i<=2*n-1;i++)
        {
            int stars=i;
            if(i>n) stars=2*n-i;
            for(int j=1;j<=stars;j++)
            {
              System.out.print("*");
            }
           
            System.out.println();
        }
    }
}
