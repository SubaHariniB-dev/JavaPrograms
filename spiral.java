import java.util.Scanner;

class spiral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        // Input matrix
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = r - 1;
        int left = 0, right = c - 1;

        System.out.println("Spiral Traversal:");

        while (top <= bottom && left <= right) {

            // 1. Top row
            for (int j = left; j <= right; j++) {
                System.out.print(arr[top][j] + " ");
            }
            top++;

            // 2. Right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // 3. Bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }

            // 4. Left column
                 if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}
