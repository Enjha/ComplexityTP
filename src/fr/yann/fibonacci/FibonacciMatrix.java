package fr.yann.fibonacci;

public class FibonacciMatrix {

    private final long[][][] exponents;

    public FibonacciMatrix() {
        exponents = new long[64][2][2];
        exponents[0] = new long[][]{{1, 1}, {1, 0}};
        for (int i = 1; i < exponents.length; i++) {
            exponents[i] = square(exponents[i - 1]);
        }
    }

    private long[][] square(final long[][] matrix) {
        return multiply(matrix, matrix);
    }

    private long[][] multiply(final long[][] matrix1, final long[][] matrix2) {
        final long[][] result = new long[matrix1[0].length][matrix2.length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[i].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    private long[][] binaryExponentiation(final long n) {
        long[][] result = new long[][]{{1, 0}, {0, 1}};
        for (int i = 31; i >= 0; i--) {
            if ((n & (1L << i)) != 0) {
                result = multiply(result, exponents[i]);
            }
        }
        return result;
    }

    public long fib(long n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            final long[][] matrix = binaryExponentiation(n - 2);
            return matrix[0][0] + matrix[0][1];
        }
    }
}
