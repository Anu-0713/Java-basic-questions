/*
Given an array arr[]. The task is to find the largest element and return it.

Examples:

Input: arr[] = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.
Input: arr[] = [5, 5, 5, 5]
Output: 5
Explanation: The largest element of the given array is 5.
Input: arr[] = [10]
Output: 10
Explanation: There is only one element which is the largest
*/
import java.util.*;
import java.io.*;
class LargestElement
  {
    public static void main(String args[]) throws IOException {
      Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
      int [] arr = new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println(new Solution().largest(arr));
    }
  }  
class Solution {
    public static int largest(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length-1;
        int Max=arr[n];
        return Max;
    }
}
