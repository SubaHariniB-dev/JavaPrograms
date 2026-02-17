import java.util.Scanner;

class zigzagdiagnol {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Zig-Zag Diagonal Order:");

        for (int sum = 0; sum <= 2 * (n - 1); sum++) {

            if (sum % 2 == 0) {
                
                for (int i = n - 1; i >= 0; i--) {
                    for (int j = 0; j < n; j++) {
                        if (i + j == sum) {
                            System.out.print(a[i][j] + " ");
                        }
                    }
                }
            } else {
                
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i + j == sum) {
                            System.out.print(a[i][j] + " ");
                        }
                    }
                }
            }

            System.out.println();
        }
    }
}
