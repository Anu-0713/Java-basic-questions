/*Problem statement
Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.

Given 'N', print the corresponding pattern.

Example:
Input: ‘N’ = 3

Output: 

1         1
1 2     2 1
1 2 3 3 2 1
*/
public class Solution {
    public static void numberCrown(int n) {
        int space=2*(n-1);
        for(int i=1;i<=n;i++)
        {
            //Numbers
            for(int j=1;j<=i;j++)
            {
               System.out.print(j+" ");
            }
            //Space
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            //Numbers
            for(int j=i;j>=1;j--)
            {
               System.out.print(j+" ");
            }
          System.out.println();
          space-=2;

        }
        
    }
}
