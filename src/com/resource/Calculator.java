package com.resource;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        int Num1 = 0;
        boolean mode;
        char Operator;
        int Num2 = 0;
        String op;
        System.out.println("Перед началом работы выберите режим работы: I - Римский : 1 - Арабский");
        Scanner scan = new Scanner(System.in);
        Scanner modescan = new Scanner(System.in);
        mode = modescan.hasNextInt();
        System.out.println("Теперь введите ваши числа");
        if(mode) {
             String input = scan.nextLine();
             Num1 = Integer.parseInt(String.valueOf(input.charAt(0)));
             Num2 = Integer.parseInt(String.valueOf(input.charAt(2)));
             Operator = input.charAt(1);
            int Answer = Calculating.solving(Num1, Num2, Operator);
            System.out.println(Answer);
        }
        else{
            System.out.println("Римские числа работают только через новую строку");
            String first = scan.next();
            op = scan.next();
            Operator = op.charAt(0);
            String second = scan.next();

            RomanNumerals firstA = new RomanNumerals(first);
            RomanNumerals secondA = new RomanNumerals(second);

            Num1 = firstA.toInt();
            Num2 = secondA.toInt();
            int Answer = Calculating.solving(Num1, Num2, Operator);
            System.out.println(ArabicNumerals.arabicToRoman(Answer));
        }
    }
}
