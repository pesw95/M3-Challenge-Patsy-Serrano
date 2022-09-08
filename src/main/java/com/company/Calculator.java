package com.company;

public class Calculator {

    public int divide(int a, int b) {
        if ( b == 0 ) {
            return 0;
        }

        return a/b;
    }

    public int add (int a,int b){
        int sum = a + b;
        return sum;
    }

    public int subtract(int a, int b){
        int sub = a - b;
        return sub;
    }
    public int multiply(int a, int b){
        int mul = a * b;
        if((a == 0 )|| (b ==0)){
            return 0;
        }
        return mul;
    }
}
