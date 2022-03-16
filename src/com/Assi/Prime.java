package com.Assi;

public class Prime {

    public static void main(String[] args) {
        int min = 2;
        int max = 100;
        for (int n = min; n <= max; n++) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / i; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
