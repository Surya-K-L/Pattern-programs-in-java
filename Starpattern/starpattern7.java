/*Write a program to display the given pattern

3

    * 
  * * 
* * * 

For example:

Input	
3
    * 
  * * 
* * * 

4
      * 
    * * 
  * * * 
* * * * 
 */
package Starpattern;

import java.util.*;
public class starpattern7 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

