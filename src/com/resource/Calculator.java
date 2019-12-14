package com.resource;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        int Num1 = 0;
        int Answer = 0;
        char Operator = 'v';
        int Num2 = 0;
        String op;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ваши числа");
        String input = scan.nextLine();
            //Num1 = Integer.parseInt(String.valueOf(input.charAt(0)));
            //Num2 = Integer.parseInt(String.valueOf(input.charAt(2)));
            //Operator = input.charAt(1);
            //Answer = Calculating.solving(Num1, Num2, Operator);
            //System.out.println(Answer);
try {


    RomanNumerals firstNum = new RomanNumerals(input);
    if (2 == firstNum.length()) {
        RomanNumerals secondNum = new RomanNumerals(input, 3);
        Operator = Calculating.findOperator(input);

        Num1 = firstNum.toInt();
        Num2 = secondNum.toInt();

        Answer = Calculating.solving(Num1, Num2, Operator);
        System.out.println(ArabicNumerals.arabicToRoman(Answer));
    } else {
        RomanNumerals secondNum = new RomanNumerals(input, 2);
        Operator = Calculating.findOperator(input);

        Num1 = firstNum.toInt();
        Num2 = secondNum.toInt();

        Answer = Calculating.solving(Num1, Num2, Operator);
        System.out.println(ArabicNumerals.arabicToRoman(Answer));
    }
}
catch (IllegalArgumentException e){
    Num1 = Integer.parseInt(String.valueOf(input.charAt(0)));
    Num2 = Integer.parseInt(String.valueOf(input.charAt(2)));
    Operator = input.charAt(1);
    Answer = Calculating.solving(Num1, Num2, Operator);
    System.out.println(Answer);
}
        }
    }

