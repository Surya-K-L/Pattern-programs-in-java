/*Write a program to display the pattern given below.

Sample Input:

5

Sample Output:

     *
    **
   ***
  ****
 *****
******

For example:

Input	
6
      *
     **
    ***
   ****
  *****
 ******
*******

4
    *
   **
  ***
 ****
*****
 */
package Starpattern;

import java.util.*;
public class starpattern4 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n+1;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
