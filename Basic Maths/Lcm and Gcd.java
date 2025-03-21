/*Given two integers a and b, the task is to compute their LCM and GCD and return an array containing their LCM and GCD.

Examples:

Input: a = 5 , b = 10
Output: [10, 5]
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
Input: a = 14 , b = 8
Output: [56, 2]
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
Input: a = 1 , b = 1
Output: [1, 1]
Explanation: LCM of 1 and 1 is 1, while their GCD is 1.
Constraints:
1 <= a, b <= 109
*/
class LCMANDGCD
  {
      public static void main(String[] args) throw IOException{
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.Print(new Solution().lcmAndGcd(a,b));
      }
  }
    class Solution {
    public static int[] lcmAndGcd(int a, int b) {
      int x = a>b?a:b;
       int y = b<a?b:a;
       //eucleadian therom 
       while(x%y != 0){
           int rem = x%y;
           x = y;
           y = rem;
       }
       
       //y is hcf 
       int lcm = (a*b)/y;
       int []arr = {lcm,y};
       return arr;
    }
}
