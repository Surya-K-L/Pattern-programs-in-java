/*Write a program to print the following pattern for a given value of N

Input:

3

Output:

1
2 3
4 5 6
4 5 6
2 3 
1



For example:

Input	
4

1
2 3
4 5 6
7 8 9 10
7 8 9 10
4 5 6 
2 3 
1 
 */
package Numberpattern;

import java.util.*;
public class numpattern17 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=1,y=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            k=k-i;
            y=k;
            for(int j=0;j<i;j++)
            {
                System.out.print(k++ +" ");
            }
            k=y;
            System.out.println();
        }
    }
}

