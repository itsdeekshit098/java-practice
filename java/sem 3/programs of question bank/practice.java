import java.util.Scanner;

public class practice {
    public static void main(String args[]) {
        int i, j, m, n;
        Scanner sc1 = new Scanner(System.in);
        m = sc1.nextInt();
        n = sc1.nextInt();
        int matrix1[][] = new int[m][n];

        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                System.out.println("enter the value to be inserted at" + i + "," + j);
                matrix1[i][j] = sc1.nextInt();
            }
        }
        for (i = 1; i <= m; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(matrix1[i][j] + " ");// note we used print here
            }
            System.out.println();// to insert next row in next line
        }

    }
}
