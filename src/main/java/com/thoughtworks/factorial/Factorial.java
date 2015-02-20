package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i == 0 || i == 1 ) {
            return 1;
        }
        if (i < 0) {
            throw new IllegalArgumentException("Must be a positive number.");
        }
        return i * compute(i-1);
    }
}
