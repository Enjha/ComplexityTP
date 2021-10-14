package fr.yann.fibonacci;

public class Fibonacci {

    public int fibonacciRecursive(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public int fibonacciIterative(int n) {
        int first = 0, second = 1, tmp;
        for (int i = 0; i < n; i++) {
            tmp = first + second;
            first = second;
            second = tmp;
        }
        return first;
    }

    public void fibonacciExponentation(int n){
        final FibonacciMatrix fibonacciFinder = new FibonacciMatrix();
        System.out.println(fibonacciFinder.fib(n));
    }



}
