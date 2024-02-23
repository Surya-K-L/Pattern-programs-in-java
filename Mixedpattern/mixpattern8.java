/*Print the following pattern for a given value of n

Input

5

Output

1
2*3
4*5*6
7*8*9*10
11*12*13*14*15
11*12*13*14*15
7*8*9*10
4*5*6
2*3
1

For example:

Input	
5

1
2*3
4*5*6
7*8*9*10
11*12*13*14*15
11*12*13*14*15
7*8*9*10
4*5*6
2*3
1

7

1
2*3
4*5*6
7*8*9*10
11*12*13*14*15
16*17*18*19*20*21
22*23*24*25*26*27*28
22*23*24*25*26*27*28
16*17*18*19*20*21
11*12*13*14*15
7*8*9*10
4*5*6
2*3
1 */
package Mixedpattern;

import java.util.*;
public class mixpattern8 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=1,y=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j!=0)
                System.out.print("*"+k++);
                else
                System.out.print(k++);
            }
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            k=k-i;
            y=k;
            for(int j=0;j<i;j++)
            {
                if(j!=0)
                System.out.print("*"+k++);
                else
                System.out.print(k++);
            }
            k=y;
            System.out.println();
        }
    }
}
