/* Write a program to print the following pattern for a given input n.
Input

3

Output

    A
  C C C
E E E E E

For example:

Input	
3
    A
  C C C
E E E E E

4
      A
    C C C
  E E E E E
G G G G G G G
*/
import java.util.*;
public class alphapattern5 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0;
        for(int i=1;i<=n*2;i=i+2)
        {
            for(int j=(n*2)-1;j>i;j=j-2)
            {
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print((char)(t+65)+" ");
            }
            t++;
            t++;
            System.out.println();
        }
    }
}
