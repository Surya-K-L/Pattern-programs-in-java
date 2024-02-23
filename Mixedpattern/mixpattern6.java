/*Write a program to print the following pattern for given integer n

Input Format

1<=n<=10

Input 1:

3
output 1:


*
# #
* * *
Input 2
-4
Output 2:

Invalid input





For example:

Input	Result
3
*
# #
* * *

-4
Invalid input
 */
package Mixedpattern;

import java.util.*;
public class mixpattern6 {

    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.println("Invalid input");
        }
        else{
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(i%2==0)
                System.out.print("* ");
                else
                System.out.print("# ");
            }
            System.out.println();
        }
    }
    }
}
