/*Write a program to print the following pattern for a given value of n

Input Format

5

Output Format

1 2 3 4 5
6 7 8 9
10 11 12
13 14
15
16
17 18
19 20 21
22 23 24 25
26 27 28 29 30

Sample Input 0

5
Sample Output 0

1  2  3  4  5  
6  7  8  9  
10  11  12  
13  14  
15  
16  
17  18  
19  20  21  
22  23  24  25  
26  27  28  29  30  
 */
package Numberpattern;

import java.util.*;
public class numpattern21 {
    public static void main(String h[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=1,k=0;
        for(int i=n;i>0;i--)
        {
            for(int j=i;j>0;j--)
            {
                System.out.print(t+" ");
                t++;
                k=t;
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print((k++)+" ");
            }
            System.out.println();
        }
        
    }
}
