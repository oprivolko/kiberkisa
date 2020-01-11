package com.company;

public class DigitCounter {
    public int calculate(int digit) {

        int sum = 0;
        while (digit > 0) {
            sum = sum + digit % 10;
            digit = digit / 10;
        }
        return sum;

    }
}