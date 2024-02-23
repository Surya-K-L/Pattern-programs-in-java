
/*Write a program to display the pattern given below.

A
B B
C C C
D D D D

For example:

Input	Result
5
A
B B
C C C
D D D D
E E E E E
*/
import java.util.*;

public class alphapattern1 {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (i + 65) + " ");
            }
            System.out.println();
        }
    }
}
