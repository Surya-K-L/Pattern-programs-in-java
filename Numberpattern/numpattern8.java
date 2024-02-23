/*Write a program to print the below pattern

For example:

Input	
3

11 
12 13 
14 15 16 

4

11 
12 13 
14 15 16 
17 18 19 20 
 */
package Numberpattern;

import java.util.*;
public class numpattern8 {

    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=11;;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    }
}
