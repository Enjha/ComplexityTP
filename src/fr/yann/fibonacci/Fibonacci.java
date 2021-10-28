package fr.yann.fibonacci;

public class Fibonacci {

    // Compléxité: O(n) : O(n)
    public long fibonacciRecursive(long n) {
        if(n <= 1) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    // Compléxité: O(n) : O(1)
    public long fibonacciIterative(long n) {
        if (n <= 1) {
            return n;
        }
        long fib = 1;
        long prevFib = 1;
        for (int i = 2; i < n; i++) {
            long temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public void fibonacciExponentation(long n) {
        final FibonacciMatrix fibonacciFinder = new FibonacciMatrix();
        System.out.println(fibonacciFinder.fib(n));
    }


}
