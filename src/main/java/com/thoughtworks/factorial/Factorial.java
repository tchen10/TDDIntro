package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i == 0 ) {
            return 1;
        }
        if (i >= 1) {
            int answer = 1;
            for (int num = 0; num < i; num++) {
                answer = answer * i;
                i--;
            }
            return answer;
        }
        if (i < 0) {
            throw new IllegalArgumentException("Must be a positive number.");
        }
        return 0;
    }
}
