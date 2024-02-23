/*Print the following pattern for a given value of N

Input 

4

output

1                   1
1 2             2 2
1 2 3       3 3 3
1 2 3 4 4 4 4 4


For example:

Input	Result
4

1             1 
1 2         2 2 
1 2 3     3 3 3 
1 2 3 4 4 4 4 4 

5

1                 1
1 2             2 2
1 2 3         3 3 3
1 2 3 4     4 4 4 4
1 2 3 4 5 5 5 5 5 5

 */
package Numberpattern;

import java.util.*;
public class numpattern15 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
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
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
