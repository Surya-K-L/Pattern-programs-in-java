/*Print the following pattern for a given value of N

Input

4

Output 

1
1 *2
1 *2 *3
1 *2 *3 *4
1 *2 *3 *4
1 *2 *3
1 *2
1


For example:

Input	
3

1
1 *2
1 *2 *3
1 *2 *3
1 *2
1

2

1
1 *2
1 *2
1 
*/
package Mixedpattern;

import java.util.*;
public class mixpattern5 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                {
                    System.out.print(j+" ");
                }
                else
                System.out.print("*"+j+" ");
            }
            System.out.println();
        }
        int t=1;
        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                {
                    System.out.print(j+" ");
                }
                else
                System.out.print("*"+t+" ");
                t++;
                
            }
            t=1;
            System.out.println();
        }
    }
}
