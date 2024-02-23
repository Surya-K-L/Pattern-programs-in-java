/*Print the given pattern for a given number

For example:

Input	Result
3
1 1 1 
2 2 2 
3 3 3 

4
1 1 1 1 
2 2 2 2 
3 3 3 3 
4 4 4 4 

5
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 
 */
package Starpattern;
import java.util.*;
public class starpattern2 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
