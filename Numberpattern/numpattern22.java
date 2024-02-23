/*Program to print  the following pattern for given N value

    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1
Input
5
output   
** Printing the pattern... **
        1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1















For example:

Input	Result
4
** Printing the pattern... **
   1 
  1 1 
 1 2 1 
1 3 3 1 
3
** Printing the pattern... **
  1 
 1 1 
1 2 1 
  */
package Numberpattern;

import java.util.*;
public class numpattern22 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("** Printing the pattern... **");
        int t=1;
        for(int i=0;i<n;i++)
        {
            String p=Integer.toString(t);
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(p.charAt(k)+" ");
            }
            t=t*11;
            System.out.println();
        }
    }
}
