import java.util.Random;

public class MatrixOperations {
    public static void main(String[] args) {
        Random random = new Random();
        int rows1 = 2, cols1 = 3;
        int rows2 = 3, cols2 = 2;
        
        int[][] matrixA = createRandomMatrix(rows1, cols1);
        int[][] matrixB = createRandomMatrix(rows2, cols2);
        
        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("Matrix B:");
        displayMatrix(matrixB);
        
        int[][] addResult = addMatrices(matrixA, matrixA);
        System.out.println("A + A:");
        displayMatrix(addResult);
        
        int[][] subResult = subtractMatrices(matrixA, matrixA);
        System.out.println("A - A:");
        displayMatrix(subResult);
        
        int[][] mulResult = multiplyMatrices(matrixA, matrixB);
        System.out.println("A * B:");
        displayMatrix(mulResult);
        
        int[][] transposeA = transposeMatrix(matrixA);
        System.out.println("Transpose of A:");
        displayMatrix(transposeA);
        
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        int det2x2 = determinant2x2(matrix2x2);
        System.out.println("Determinant: " + det2x2);
        
        double[][] inv2x2 = inverse2x2(matrix2x2);
        System.out.println("Inverse:");
        displayDoubleMatrix(inv2x2);
        
        int[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("3x3 Matrix:");
        displayMatrix(matrix3x3);
        int det3x3 = determinant3x3(matrix3x3);
        System.out.println("Determinant: " + det3x3);
    }
    
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
        return matrix;
    }
    
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }
    
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }
    
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }
    
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
    
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) return null;
        
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) det;
        inverse[0][1] = -matrix[0][1] / (double) det;
        inverse[1][0] = -matrix[1][0] / (double) det;
        inverse[1][1] = matrix[0][0] / (double) det;
        return inverse;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
    
    public static void displayDoubleMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%.2f\t", value);
            }
            System.out.println();
        }
    }
}