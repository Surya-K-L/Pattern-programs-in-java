/*Print the following pattern for a given n

For n= 4,


*
# #
* * *
# # # #
* * * *
# # #
* *
#

For example:

Input	
3

* 
# # 
* * * 
# # # 
* * 
# 
 */
package Mixedpattern;

import java.util.*;
public class mixpattern4 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2==1)
                {
                    System.out.print("* ");
                }
                else
                System.out.print("# ");
            }
            System.out.println();
        }
        if(n%2==1){
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                if(i%2==1)
                {
                    System.out.print("# ");
                }
                else
                System.out.print("* ");
            }
            System.out.println();
        }}
        else{
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                if(i%2==1)
                {
                    System.out.print("* ");
                }
                else
                System.out.print("# ");
            }
            System.out.println();
        }
        }
    }
}
