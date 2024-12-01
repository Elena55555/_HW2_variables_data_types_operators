package org.example;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println(" ");
        System.out.println("Task № 1 ");
        int a = 3;
        double b = 3.7;
        char c = '1'; /** Using the char variable, we add not the number itself,
         but the character code
         */
        double result = a+b+c ;
        System.out.println(result);
    }
    public static void task2() {
        System.out.println(" ");
        System.out.println("Task № 2 ");
        int a = 5;
        int b = 12;
        boolean check = a < b;
        System.out.println(check);
    }
    public static void task3() {
        System.out.println(" ");
        System.out.println("Task № 2 ");
        int a = 6;
        a += 6; /** operation on a variable a addition
         */
        System.out.println(a);
        a-=2;   /** operation on a variable a subtraction
         */
        System.out.println(a);
        a/=5;   /** operation on a variable a  division
         */
        System.out.println(a);
        a*=7;   /** operation on a variable a  multiplication
         */
        System.out.println(a);
    }
}
