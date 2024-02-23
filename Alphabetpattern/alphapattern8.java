/*print diamond pattern

Input Format

when N=3 , S=a

Constraints

1<=N<=100


For example:

Input	
3
a
  a 
 aaa 
aaaaa 
 aaa
  a
 */
import java.util.*;
public class alphapattern8 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c=sc.next().charAt(0);
        for(int i=1;i<n*2;i=i+2)
        {
            for(int j=(n*2)-1;j>i;j=j-2)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(c);
            }
            System.out.println();
        }
        
        
    }
}
