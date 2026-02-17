import java.util.Scanner;

class spiralrotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();  

        int[][] a = new int[n][n];

        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = in.nextInt();

        
        for (int rot = 0; rot < k; rot++) {

            int top = 0;
            int bottom = n - 1;
            int left = 0;
            int right = n - 1;

            while (left < right && top < bottom) {

                int temp = a[top][left];

            
                for (int i = top; i < bottom; i++)
                    a[i][left] = a[i + 1][left];

                
                for (int j = left; j < right; j++)
                    a[bottom][j] = a[bottom][j + 1];

                
                for (int i = bottom; i > top; i--)
                    a[i][right] = a[i - 1][right];

                
                for (int j = right; j > left + 1; j--)
                    a[top][j] = a[top][j - 1];

                a[top][left + 1] = temp;

                top++;
                bottom--;
                left++;
                right--;
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
