/*Write a program to display the pattern given below.

Sample Input:

3

Expected Output:

1         * 
2 3     * * 
4 5 6 * * *




For example:

Input	
3

1         * 
2 3     * * 
4 5 6 * * * 

2

1     * 
2 3 * * 
 */
package Mixedpattern;

import java.util.*;
public class mixpattern3 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(t+" ");
                t++;
            }
            for(int k=n;k>i;k--)
            {
                System.out.print("  ");
            }
            for(int k=n;k>i;k--)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
