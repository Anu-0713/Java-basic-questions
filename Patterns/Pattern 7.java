/*Problem statement
Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Triangle.

Example:
Input: ‘N’ = 3

Output: 

  *
 ***
*****
*/
public class Solution {
    public static void nStarTriangle(int n) {
        for(int i=0;i<n;i++)
        {   //space
            for(int j=0;j<n-i-1;j++)
            {
             System.out.print(" ");   
            }
            //star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.println();
            }
        }
    }
}
