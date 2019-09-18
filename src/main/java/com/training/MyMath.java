package com.training;

import java.math.BigInteger;

public final class MyMath {

    private MyMath(){
        throw new IllegalStateException();
    }

    public static long fibonacciCyclic(long n) {
        if (n < 0 || n > 92){
            throw new IllegalArgumentException("N expected to be in range: [93 > n > 0]");
        }
        if (n == 0)
            return 0;
        long prev = 0;
        long curr = 1;
        for (long i = 1; i < n; i++) {
            long tmp = prev;
            prev = curr;
            curr = tmp + curr;
        }
        return curr;
    }

    public static long fibonacciRecursive(long n){
        if (n < 0 || n > 92){
            throw new IllegalArgumentException("N expected to be in range: [93 > n > 0]");
        }
        if (n <= 1)
            return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static long factorialCyclic(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial for negative numbers is undefined!");
        }
        if (n == 1 || n == 0) {
            return 1;
        }
        long res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial for negative numbers is undefined!");
        }
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static BigInteger factorialBig(int n){
        if (n < 0) {
            throw new IllegalArgumentException("Factorial for negative numbers is undefined!");
        }
        if (n == 1 || n == 0)
            return BigInteger.ONE;
        BigInteger nBigInteger = new BigInteger(Integer.toString(n));
        BigInteger res = BigInteger.ONE;
        while (!nBigInteger.equals(BigInteger.ZERO)) {
            res = res.multiply(nBigInteger);
            nBigInteger = nBigInteger.subtract(BigInteger.ONE);
        }

        return res;
    }
}