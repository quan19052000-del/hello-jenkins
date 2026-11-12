package com.example;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App app = new App();

        System.out.println("Hello Jenkins!");
        System.out.println("5 + 3 = " + app.add(5, 3));
    }
}

