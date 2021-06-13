package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Double number1, number2, result, number = 0.0;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, /, sqrt, %");
        String operator = input.nextLine();
        // ask users to enter numbers
        System.out.println(operator);
        System.out.println("Enter first number");
        number1 = input.nextDouble();
        if (!operator.equals("sqrt")){
            System.out.println("Enter second number");
            number = input.nextDouble();
        }
        number2 = number;

        switch (operator) {

            // performs addition between numbers
            case "+":
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            // performs subtraction between numbers
            case "-":
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            // performs multiplication between numbers
            case "*":
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            // performs division between numbers
            case "/":
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            case "sqrt":
                result = Math.sqrt(number1);
                System.out.println("Square root of "+ number1+" is "+result);
                break;

            case "%":
                result = (number1/number2)*100;
                System.out.println("% of "+number1+" out of "+number2+" is "+ result );
                break;


            default:
                System.out.println("Invalid operator!");
                break;
        }

        input.close();
    }
}