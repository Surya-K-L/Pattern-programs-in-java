/*Print the given square pattern

For example:

Input	
2
A B
A B 

3
A B C 
A B C 
A B C 
 */
import java.util.*;
public class alphapattern3{
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print((char)(j+65)+" ");
            }
            System.out.println();
        }
    }
}
