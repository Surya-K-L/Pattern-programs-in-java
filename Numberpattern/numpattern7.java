/*Write a program to print the following pattern based on input n

For example:

Input	
3

1 
2 3 
4 5 6 
 */
package Numberpattern;
import java.util.*;
public class numpattern7 {

    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    }
}

