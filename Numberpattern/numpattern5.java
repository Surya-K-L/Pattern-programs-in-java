/*Write a program to print the current pattern

For example:

Input	
3
1 
1 1 
1 1 1 

5
1 
1 1 
1 1 1 
1 1 1 1 
1 1 1 1 1 
 */
package Numberpattern;

import java.util.*;
public class numpattern5 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(t+" ");
            }
            System.out.println();
        }
    }
}
