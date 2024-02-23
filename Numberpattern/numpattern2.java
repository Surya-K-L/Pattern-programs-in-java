/*Print the pattern for the given number

For example:

Input	Result
3
1 
1 2 
1 2 3 

4
1 
1 2 
1 2 3 
1 2 3 4 
 */
package Numberpattern;
import java.util.*;
public class numpattern2 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
