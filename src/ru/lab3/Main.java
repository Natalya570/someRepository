package ru.lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пример в формате '2 + 2' и нажмите Enter:");
        String userInput = "";
        int firstNumber;
        int secondNumber = 0;
        String errorInput = "";
        while (!"q".equals(userInput) && !"q".equals(errorInput)) {
            try {
                firstNumber = scanner.nextInt();
                userInput = scanner.next();
                if (!"!".equals(userInput)) {
                    secondNumber = scanner.nextInt();
                }
                double result;
                switch (userInput) {
                    case "+":
                        result = plus(firstNumber, secondNumber);
                        break;
                    case "-":
                        result = minus(firstNumber, secondNumber);
                        break;
                    case "*":
                        result = ymn(firstNumber, secondNumber);
                        break;
                    case "/":
                        if (secondNumber == 0) {
                            System.out.println("На ноль делить нельзя, введите другое значение!");
                            continue;
                        }
                        result = del(firstNumber, secondNumber);
                        break;
                    case "!":
                        result = fact(firstNumber);
                        break;
                    default:
                        result = 0;
                        break;
                }
                System.out.println(result);
            } catch (InputMismatchException ex) {
                errorInput = scanner.next();
                if (!"q".equals(errorInput)) {
                    System.out.println("Wrong input data!");
                }
                continue;
            }
        }
    }
    private static int plus(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    private static int minus(int numberOne, int numberTwo) {
        return numberOne - numberTwo; }
    private static int ymn(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
    private static int del(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }
    private static int fact(int numberOne){
        int res = 1;
        for (int i = 1; i <= numberOne; i++) {
            res *= i;
        }
        return res; }
}
