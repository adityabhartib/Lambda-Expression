package com.bridgelabz;


interface Calculator{
    int calculate( int a, int b);
}
public class lambdaExpression {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subs = (a, b) -> a - b;
        Calculator mult = (a, b) -> a * b;
        Calculator division= (a,b) -> a/b;

        System.out.println("Adition Expression :" + add.calculate(3, 6));
        System.out.println("Substraction Expression :" + subs.calculate(6, 3));
        System.out.println("Multiplication Expression :" + mult.calculate(6, 3));
        System.out.println("Division Expession :"+division.calculate(6,3));
    }
}
