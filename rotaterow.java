import java.util.Scanner;
class rotaterow{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = in.nextInt();
        System.out.print("Enter number of columns: ");
        int c = in.nextInt();

        int[][] a = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter row number to rotate (0-based index): ");
        int row = in.nextInt();

        System.out.print("Enter number of rotations: ");
        int k = in.nextInt();
        k = k % c;
        int[] temp = new int[c];
        for (int j = 0; j < c; j++) {
            temp[(j + k) % c] = a[row][j];
        }
        for (int j = 0; j < c; j++) {
            a[row][j] = temp[j];
        }
        System.out.println("Matrix after rotating row:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}