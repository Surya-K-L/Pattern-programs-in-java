/*Write a program to print the following pattern for a given value of n

For example:

Input	
3
A 
B C 
D E F 

4
A 
B C 
D E F 
G H I J 
 */
import java.util.*;
public class alphapattern4 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(t+65)+" ");
                t++;
            }
            System.out.println();
        }
    }
}
