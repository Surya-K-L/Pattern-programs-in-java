/*program to print the following pattern

* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

For example:

Input	Result
5
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
*

3

* 
* * 
* * * 
* * 
*  
*/
package Starpattern;

import java.util.*;
public class starpattern6 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
