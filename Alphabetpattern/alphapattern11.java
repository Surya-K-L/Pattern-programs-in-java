/*Given an odd length word which should be printed from the middle of the word.

The output should be in the following pattern.

Example:

Input: PROGRAM

Output:

G

GR

GRA

GRAM

GRAMP

GRAMPR

GRAMPRO

For example:

Input	
hello
l
ll
llo
lloh
llohe
 */
import java.util.*;
public class alphapattern11 {
    public static void main (String h[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=a.substring(a.length()/2,a.length())+a.substring(0,(a.length()/2));
        int t=a.length();
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(b.charAt(j));
            }
            System.out.println();
        }
    }
}
