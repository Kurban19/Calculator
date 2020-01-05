package com.resource;

public class Calculating {
    public static int solving(int num1, int num2, char operation) {



        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Операция не распознана");
        }
        return result;
    }

    public static char findOperator(String in) {
        char[] chars = in.toCharArray();
        char Operator = 'f';
        for (int i = 0; i < chars.length; i++) {
            Operator = chars[i];
            switch (Operator) {
                case '+':
                    return Operator;
                case '-':
                    return Operator;
                case '*':
                    return Operator;
                case '/':
                    return Operator;
                default:
                    continue;
            }
        }
        return 'g';
    }
}
