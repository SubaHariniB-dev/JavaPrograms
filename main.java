import java.util.Scanner;

class main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r1, c1;

        System.out.println("enter r1");
        r1 = sc.nextInt();

        System.out.println("enter c1");
        c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        // input matrix
        System.out.println("enter matrix elements:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // 🔥 swap first row and last row (NO LOOP)
        int[] temp = a[0];
        a[0] = a[r1 - 1];
        a[r1 - 1] = temp;

        // print matrix
        System.out.println("matrix after swapping:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
