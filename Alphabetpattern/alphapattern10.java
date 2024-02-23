
/*Print Z pattern

Input Format

when N=3,

Constraints

1<=N<=100

 */
import java.util.*;

public class alphapattern10 {
    public static void main(String h[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n) {
                    System.out.print(j + " ");
                } else if (j == n - i + 1) {
                    System.out.print(j);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
