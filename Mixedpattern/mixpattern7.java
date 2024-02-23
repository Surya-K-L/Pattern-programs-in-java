/*Print the following pattern for given N value.

Input

4

Output

1 b c d
e 6 g h
i  j 11 l
m n o 16
For example:

Input	
4

1 b c d
e 6 g h
i j 11 l
m n o 16

3

1 b c
d 5 f
g h 9
 */
package Mixedpattern;

import java.util.*;
public class mixpattern7 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0,k=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                k++;
                t++;
                if(i==j)
                {
                    System.out.print(t+" ");
                }
                else
                System.out.print((char)(k+96)+" ");
            }
            System.out.println();
        }
    }
}
