/*Write a program to print the given pattern 

For example:

Input	Result
3
1
2 2
3 3 3 

4
1 
2 2 
3 3 3 
4 4 4 4 
 */
package Numberpattern;
import java.util.*;
public class numpattern1 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

