
/*Write a program to print the following pattern for a given value of n

For example:

Input	Result
3
A 
A B 
A B C 

4
A 
A B 
A B C 
A B C D 
*/
import java.util.*;

public class alphapattern2 {

    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (j + 65) + " ");
            }
            System.out.println();
        }
    }
}
