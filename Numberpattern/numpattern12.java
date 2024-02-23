/*Print the given 2D Pattern

1 
1 2 
1 2 3 
1 2 3
1 2 
1 

For example:

Input	
3

1 
1 2 
1 2 3 
1 2 3 
1 2 
1 

4

1 
1 2 
1 2 3
1 2 3 4 
1 2 3 4  
1 2 3 
1 2 
1 
 */
package Numberpattern;

import java.util.*;
public class numpattern12 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(t+" ");
                t++;
            }
            t=1;
            System.out.println();
        }
    }
}
