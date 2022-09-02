package com.bridgelabz;

interface Calculator{
    int calculate( int a, int b);
}
public class lambdaExpression {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subs = (a, b) -> a - b;
        Calculator mult = (a, b) -> a * b;

        System.out.println("Adition is :" + add.calculate(3, 6));
        System.out.println("Substraction is:" + subs.calculate(6, 3));
        System.out.println("Multiplication is:" + mult.calculate(6, 3));
    }
}
