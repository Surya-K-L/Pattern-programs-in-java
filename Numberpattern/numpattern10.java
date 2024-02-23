/*Program to print the following binary pattern



10101
01010
10101
01010
10101

For example:

Input	
4

1010
0101
1010
0101

2

10
01
 */
package Numberpattern;

import java.util.*;
public class numpattern10 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if((i+j)%2==0)
                System.out.print(1);
                else
                System.out.print(0);
            }
            System.out.println();
        }
    }
}
