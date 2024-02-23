/*Write a program to display the pattern given below.

5
5 4
5 4 3
5 4 3 2
5 4 3 2 1

For example:

Input	
5

5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
 */
package Numberpattern;

import java.util.*;
public class numpattern6 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(t+" ");
                t--;
            }
            t=n;
            System.out.println();
        }
    }
}

