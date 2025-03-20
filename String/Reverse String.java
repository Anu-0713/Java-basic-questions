/*
You are given a string s, and your task is to reverse the string.

Examples:

Input: s = "Geeks"
Output: "skeeG"
Input: s = "for"
Output: "rof"
Input: s = "a"
Output: "a"
Constraints:
1 <= s.size() <= 106
s contains only alphabetic characters (both uppercase and lowercase).
*/
import java.io.*;
import java.lang.*;
import java.util.*;
 class Reverse
{
 public static void main(String args[]) throws IOException
   {
   Scanner sc=new Scanner(System.in);
  String  str=sc.nextLine();
  System.out.println(new Solution().reverseString(str));
  }
}
class Solution {
  public static String reverseString(String s)  {
   StringBuilder Rev= new StringBuilder();
   Rev.append(s);
   Rev.reverse();
   return Rev.toString();
   }
}
