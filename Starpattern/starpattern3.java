/*Print the following start pattern in triangles

For example:

Input	
3
* 
* * 
* * * 

2
* 
* * 
 */
package Starpattern;
import java.util.*;
public class starpattern3 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
