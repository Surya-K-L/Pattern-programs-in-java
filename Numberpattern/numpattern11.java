/*Program to print the following pattern for given value of N.

Input

5

Output

** Printing the pattern... **

1 

2 7 

3 8 13 

4 9 14 19 

5 10 15 20 25

 */
package Numberpattern;

import java.util.*;
public class numpattern11 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0,k=0;
        System.out.println("** Printing the pattern... **");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                
                if(j==1)
                {
                System.out.print(i+" ");
                k=i;
                }
                else{
                    System.out.print(k+n+" ");
                    k=k+n;
                    
                }
            }
            System.out.println();
        }
    }
}
