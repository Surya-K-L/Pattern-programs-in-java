/*Write a program to display the pattern given below.

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

For example:

Input	
5

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */
package Numberpattern;

import java.util.*;
public class numpattern4 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
