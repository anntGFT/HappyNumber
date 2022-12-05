package org.example;

public class Solution {
    public Solution(){

    }

    public boolean isHappy(int n) {

        int sum = 0;

        if (n == 1 || n == 7)
            return true;

        if (n < 10)
            return false;

        while (n > 0) {

            int aux = n % 10;

            sum += Math.pow(aux, 2);
            n /= 10;
        }

        return isHappy(sum);
    }
}