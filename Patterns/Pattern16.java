/*
Problem statement
Sam is curious about Alpha-Ramp, so he decided to create Alpha-Ramp of different sizes.

An Alpha-Ramp is represented by a triangle, where alphabets are filled from the top in order.

For every value of ‘N’, help sam to return the corresponding Alpha-Ramp.

Example:
Input: ‘N’ = 3

Output: 
A
B B
C C C
*/
public class Solution {
    public static void alphaRamp(int n) {
      for(int i=0;i<n;i++)
      {
          char ch='A';
          char b = (char)('A'+i);
          for(int j=0;j<=i;j++)
          {
              System.out.print(b+" ");
          }
          System.out.println();
      }
    }
}
