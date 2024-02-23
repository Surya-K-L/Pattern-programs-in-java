/*Write a program to display the given pattern



3

     1 
   2 2 
 3 3 3 



For example:

Input	
3
    1 
  2 2 
3 3 3 


4
      1 
    2 2 
  3 3 3 
4 4 4 4 
 */
package Numberpattern;

import java.util.*;
public class numpattern13 {
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
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
