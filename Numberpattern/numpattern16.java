/*Print the following pattern for a given value of N

Input

4

Output

0 1 2 3
4 5 6
7 8
9
9
8 7
6 5 4
3 2 1 0



For example:

Input	
4

0 1 2 3
4 5 6
7 8
9
9
8 7
6 5 4
3 2 1 0

 */
package Numberpattern;

import java.util.*;
public class numpattern16 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0,k=0;
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(t+" ");
                t++;
                k=t;
            }
            System.out.println();
        }
        int f=k-1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(f+" ");
                f--;
            }
            System.out.println();
        }
    }
}
