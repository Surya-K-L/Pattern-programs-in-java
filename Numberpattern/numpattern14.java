/*Program to print the following pattern
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1
Input
5
Output
** Printing the pattern... **
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1


For example:

Input	
5
** Printing the pattern... **
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1

3
** Printing the pattern... **
1 
2 1 
3 2 1  */
package Numberpattern;

import java.util.*;
public class numpattern14 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0,p=n;
        System.out.println("** Printing the pattern... **");
        for(int i=1;i<=n;i++)
        {
             t=i;
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                {
                    System.out.print(i+" ");
                }
                else {
                   System.out.print(--t+" ");
                }
                
            }
            System.out.println();
        }
    }
}
