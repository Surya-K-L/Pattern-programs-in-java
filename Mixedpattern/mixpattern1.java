/*Write a program to display the pattern given below.

Sample Input:

5

Sample Output:

A B C D E
1 2 3 4
A B C
1 2
A

For example:

Test
3

A B C
1 2
A
 */
package Mixedpattern;

import java.util.*;

public class mixpattern1 {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = 0, k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                if (i % 2 == 1) {
                    System.out.print((char) (t + 65) + " ");
                    t++;
                } else
                    System.out.print(k + " ");
                k++;
            }
            k = 1;
            t = 0;
            System.out.println();
        }
    }
}
