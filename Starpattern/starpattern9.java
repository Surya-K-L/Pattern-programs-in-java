/*Write a program to print Z Pattern

For example:

Input	
3
* * *
  *
* * *
4
* * * *
    *  
  *
* * * *
 */
package Starpattern;

import java.util.*;
public class starpattern9 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 ||i==n-1)
                {
                    System.out.print("* ");
                }
                else if(j==n-i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("  ");
                }
            }
                System.out.println();
        }
    }
}
