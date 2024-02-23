/*Write a program to print the following pattern.

Input

4

Output

          A 1
      A  B 1 2 
   A B C 1 2 3
A B C D 1 2 3 4
* * * * 1 2 3 4
  * * * 5 6 7
     * * 8 9
       * 10


For example:

Input	Result
4
        A 1
      A B 1 2 
    A B C 1 2 3
  A B C D 1 2 3 4
  * * * * 1 2 3 4
    * * * 5 6 7
      * * 8 9
        * 10
3
      A 1
    A B 1 2 
  A B C 1 2 3
  * * * 1 2 3
    * * 4 5
      * 6
 */
package Mixedpattern;
import java.util.*;
public class mixpattern9 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),p=1,m=1;
        for(int i=0;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print((char)(k+65)+" ");
            }
            for(int t=0;t<=i;t++)
            {
                System.out.print(p++ +" ");
            }
            p=1;
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("  ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("* ");
            }
            for(int s=0;s<i;s++)
            {
                System.out.print(m++ +" ");
            }
            System.out.println();
        }
    }
}
