/*
Given an array, arr[] sorted in ascending order and an integer k. Return true if k is present in the array, otherwise, false.

Examples:

Input: arr[] = [1, 2, 3, 4, 6], k = 6
Output: true
Exlpanation: Since, 6 is present in the array at index 4 (0-based indexing), output is true.
Input: arr[] = [1, 2, 4, 5, 6], k = 3
Output: false
Exlpanation: Since, 3 is not present in the array, output is false.
Input: arr[] = [2, 3, 5, 6], k = 1
Output: false
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
      int k=sc.nextInt();
      System.out.println(new Solution().searchInSorted(arr,k));
    }
}
class Solution {
    static boolean searchInSorted(int arr[], int k) {
        boolean m=false;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
             if(arr[i]==k)
             {
                 m=true;
             }
        }
        return m;
    }
}
