/*Write a program which displays the below pattern for a given value of n

4

10 
9 8 
7 6 5 
4 3 2 1 



For example:

Input	
4

10 
9 8 
7 6 5 
4 3 2 1 
 */
package Numberpattern;

import java.util.*;
public class numpattern20 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=n,a=0;
        while(t>0)
        {
            a=a+t;
            t--;
        }
        int k=a;
        for(int i=n;i>0;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(k+" ");
                k--;
            }
            System.out.println();
        }
    }
}
