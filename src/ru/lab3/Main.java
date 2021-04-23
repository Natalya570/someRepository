package ru.lab3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers!");
        String userInput = "";
        int firstNumber = 0;
        int secondNumber = 0;
        while (!"q".equals(userInput)) {
            try {
                if (scanner.hasNextInt()) {
                    firstNumber = scanner.nextInt();
                }
                if (scanner.hasNextLine()) {
                    userInput = scanner.nextLine();
                }
                if (scanner.hasNextInt()) {
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
                System.out.println("Wrong input data!");
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
        for (int i = 1; i < numberOne; i++) {
            res *= i;
        }
        return res; }
}
