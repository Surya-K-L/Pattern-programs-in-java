/*Write a program which displays the below pattern for a given value of n

4

J 
I H  
G F E 
D C B A 



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
public class alphapattern9 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=n,k=0;
        while(t>0)
        {
            k=k+t;
            t--;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)(k+64)+" ");
                k--;
            }
            System.out.println();
        }
}
}
