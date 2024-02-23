/*Write a program which displays the below pattern for a given value of n

For example:

Input
4
      J 
    I H 
  G F E 
D C B A 

3
    F 
  E D 
C B A 
 */
import java.util.*;
public class alphapattern7 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=n,m=0;
        while(t>0)
        {
            m=m+t;
            t--;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print((char)(m+64)+" ");
                m--;
            }
            System.out.println();
        }
    }
}
