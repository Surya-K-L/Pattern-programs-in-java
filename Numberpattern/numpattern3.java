/*Print the given square pattern

For example:

Input	
2
1 2 
1 2 

3
1 2 3 
1 2 3 
1 2 3 
 */
package Numberpattern;
import java.util.*;
public class numpattern3 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
