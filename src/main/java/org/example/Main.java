package org.example;

public class Main {
    public static void main(String[] args) {

        aritmetica(6);
    }
    public static void aritmetica(int x) {
        for (int i = 1; i <= 10; i++){
            int result = x * i;
            System.out.println(x + " moltiplicato per "+ i + " fa: " + result);
        }
    }
}