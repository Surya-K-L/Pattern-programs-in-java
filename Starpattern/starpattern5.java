/*Write a program to display the pattern given below.

Sample Input:

5

Sample Output:

    * 
   * * 
  * * * 
 * * * * 
* * * * *

For example:

Input	
5
    *
   * *
  * * *
 * * * *
* * * * *
7
      *
     * *
    * * *
   * * * *
  * * * * *
 * * * * * *
* * * * * * *
 */
package Starpattern;
import java.util.*;
public class starpattern5 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
