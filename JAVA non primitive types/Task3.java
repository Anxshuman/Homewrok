public class Task3 {
    public static void main(String[] args) {
        // initializing an 2D array with 10 elements
        int[][] mat = new int[10][10];
        int sum = 0;

        // Fill the array with required values
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    mat[i][j] = i;
                } else {
                    mat[i][j] = 0;
                }
            }
        }

        // sum of diagonal elements
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
        }

        // print mat and sum of diagonal elements
        System.out.println("Matrix:");
        for (int[] row : mat) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum of diagonal elements: " + sum);
    }
}
