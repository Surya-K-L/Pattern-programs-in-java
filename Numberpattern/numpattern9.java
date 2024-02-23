/* Write a program to print the pattern given below

For example:

Input	
3

1
3 5
7 9 11

4

1 
3 5
7 9 11
13 15 17 19
*/
package Numberpattern;
import java.util.*;
public class numpattern9 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(t+" ");
                t=t+2;
            }
            System.out.println();
        }
    }
}
