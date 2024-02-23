/*Print the given  pattern

For example:

Input
2
* * 
* *
 
3
* * * 
* * * 
* * * 
 */
package Starpattern;
import java.util.*;
public class starpattern1 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
