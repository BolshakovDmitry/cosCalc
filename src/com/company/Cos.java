package com.company;

public class Cos {
    public double cos(double x, double precision) {
        double result = 1D;
        double nominator = 1D;
        double deNominator = 1D;
        boolean flag = true;
        for (int n = 2; n <= precision; n += 2) {
            nominator = Math.pow(x, n);
            deNominator *= (n - 1);
            deNominator*=n;
            if (flag) {
                result -= nominator / deNominator;
                flag = false;
            } else {
                result += nominator / deNominator;
                flag = true;
            }
        }
        return result;
    }
}
